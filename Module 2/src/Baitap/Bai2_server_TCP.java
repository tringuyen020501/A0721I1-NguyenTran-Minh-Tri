package Baitap;

import javax.swing.*;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public final class Bai2_server_TCP extends JFrame implements AncestorListener{

    private ServerSocket server;
    private Thread THREAD;
    private JTextArea tArea = new JTextArea("");
    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub
        //ServerSocket server = new ServerSocket(7788);
        //System.out.println("Server is start !");
        new Bai2_server_TCP();

    }
    public Bai2_server_TCP()
    {
        this.setTitle("Client");
        this.setSize(600,400);
        this.setDefaultCloseOperation(3);
        this.setLayout(new BorderLayout());
        JPanel panel = new JPanel(new FlowLayout());
        panel.setPreferredSize(new Dimension(600, 70));
        JLabel lb = new JLabel("Nhap cong : ");
        JTextField tfCong = new JTextField("8080");
        tfCong.setColumns(7);
        JButton conButton = new JButton("Connect");
        JButton cloButton = new  JButton("Close");
        JTextField tf = new JTextField("");
        tf.setColumns(29);
        JButton sendButton = new JButton("send");
        panel.add(lb); panel.add(tfCong); panel.add(conButton); panel.add(cloButton);// panel.add(tf); panel.add(sendButton);
        this.add(panel,BorderLayout.NORTH);
        this.add(tArea,BorderLayout.CENTER);
        conButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                if(tfCong.getText()!="")
                {
                    int cong = Integer.parseInt(tfCong.getText());
                    try {
                        server = new ServerSocket(cong);
                        tArea.setText(tArea.getText()+"\n"+"Server dang chay !");
                        THREAD = new Thread(new ServerAccept());
                        THREAD.start();

                    } catch (IOException e1) {
                        // TODO Auto-generated catch block
                        e1.printStackTrace();
                        tArea.setText(tArea.getText()+"\n"+"Loi!!!");
                    }
                    conButton.setEnabled(false);
                    cloButton.setEnabled(true);
                }
            }
        });
        cloButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                try {
                    server.close();
                    tf.setText("");
                    cloButton.setEnabled(false);
                    conButton.setEnabled(true);

                } catch (IOException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }
            }
        });
        this.setVisible(true);

    }
    @Override
    public void ancestorAdded(AncestorEvent event) {
        // TODO Auto-generated method stub

    }
    @Override
    public void ancestorRemoved(AncestorEvent event) {
        // TODO Auto-generated method stub

    }
    @Override
    public void ancestorMoved(AncestorEvent event) {
        // TODO Auto-generated method stub

    }
    public class ServerAccept implements Runnable
    {
        boolean stop =false;

        @Override
        public void run() {
            // TODO Auto-generated method stub
            while(!stop)
            {
                try {
                    new ThreadBai2(server.accept()).start();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                    stop = true;
                };
            }
        }


    }
    class ThreadBai2 extends Thread
    {
        Socket socket = null;
        DataInputStream din = null;
        DataOutputStream dos = null;
        String msgCl="";
        boolean stop=false;
        public ThreadBai2(Socket sk) throws IOException
        {
            this.socket = sk;
            this.din = new DataInputStream(socket.getInputStream());
            this.dos = new DataOutputStream(socket.getOutputStream());
        }

        public void run()
        {
            while(!stop)
            {

                try
                {
                    msgCl = din.readUTF();
                    tArea.setText(tArea.getText()+"\n"+"Yeu cau tu client :"+msgCl);
                    if(msgCl!="")
                    {
                        String s ="" + Tinh(msgCl);
                        msgCl = s;
                    }
                    else
                        msgCl = "Server not know what you want?";

                    dos.writeUTF(msgCl);
                    dos.flush();
                    this.sleep(500);
                } catch (IOException | InterruptedException e)
                {
                    e.printStackTrace();
                    this.stop = true;

                }


            }

        }
        public float Tinh(String str)
        {
            String[] duong = new String[100];
            String[] am = new String[100];
            int dem = 0;
            int dem2 = 0;
            char pheptinh = 'n';
            String tem = "";
            for (int i = 0; i < str.length(); i++)
            {

                if (str.charAt(i) != '+' && str.charAt(i) != '-')
                    tem += str.charAt(i);
                else
                {
                    if (pheptinh == 'n' || pheptinh == '+')
                    {
                        duong[dem] = tem;
                        dem++;
                    }
                    if (pheptinh == '-')
                    {
                        am[dem2] = tem;
                        dem2++;
                    }
                    pheptinh =str.charAt(i);
                    tem = "";
                }
                if (i == str.length()-1 )
                {
                    if (pheptinh == 'n' || pheptinh =='+')
                    {
                        duong[dem] = tem;
                        dem++;
                    }
                    if (pheptinh == '-')
                    {
                        am[dem2] = tem;
                        dem2++;
                    }
                    pheptinh =str.charAt(i);
                    tem = "";
                }
            }
            float tong = 0;
            float hieu = 0;
            for (int i = 0; i < duong.length; i++)
            {
                if (duong[i] != null)
                {
                    if (duong[i].contains("+") || duong[i].contains("-") || duong[i].contains("*") || duong[i].contains("/") || duong[i].contains("("))
                    {
                        float bientam = 0;
                        String temp = "";
                        int z = 0;
                        for (; z < duong[i].length(); z++)
                        {
                            if (duong[i].charAt(z) != '+' && duong[i].charAt(z) != '-' && duong[i].charAt(z) != '*' && duong[i].charAt(z) != '/')
                            {
                                temp += duong[i].charAt(z);
                            }
                            else
                            {
                                bientam = Float.parseFloat(temp);
                                break;
                            }
                        }
                        char phep = 'n';
                        temp = "";
                        for (; z < duong[i].length(); z++)
                        {
                            if (duong[i].charAt(z) != '+' && duong[i].charAt(z)!= '-' && duong[i].charAt(z) != '*' && duong[i].charAt(z) != '/')
                            {
                                temp += duong[i].charAt(z);
                            }
                            else
                            {
                                if (temp != "" && phep != 'n')
                                {
                                    switch (phep)
                                    {
                                        case '+':
                                            bientam += Float.parseFloat(temp);
                                            break;
                                        case '-':
                                            bientam -= Float.parseFloat(temp);
                                            break;
                                        case '*':
                                            bientam *= Float.parseFloat(temp);
                                            break;
                                        case '/':
                                            bientam /= Float.parseFloat(temp);
                                            break;
                                        default:
                                            break;
                                    };
                                }
                                phep = duong[i].charAt(z);
                                temp = "";
                            }

                        }
                        if (z == duong[i].length())
                        {
                            if (temp != "")
                            {
                                if (phep == '*')
                                {
                                    bientam = bientam * Float.parseFloat(temp);
                                }
                                if (phep == '/')
                                {
                                    bientam = bientam / Float.parseFloat(temp);
                                }
                            }
                        }
                        tong += bientam;
                    }
                    else
                    {
                        tong += Float.parseFloat(duong[i]);
                    }
                }
                else
                {
                    break;
                }
            }
            for (int i = 0; i < am.length; i++)
            {
                if (am[i] != null)
                {
                    if (am[i].contains("+") || am[i].contains("-") || am[i].contains("*") || am[i].contains("/") || am[i].contains("("))
                    {
                        float bientam = 0;
                        String temp = "";
                        int z = 0;
                        for (; z < am[i].length(); z++)
                        {
                            if (am[i].charAt(z) != '+' && am[i].charAt(z) != '-' && am[i].charAt(z) != '*' && am[i].charAt(z) != '/')
                            {
                                temp += am[i].charAt(z);
                            }
                            else
                            {
                                bientam = Float.parseFloat(temp);
                                break;
                            }
                        }
                        char phep = 'n';
                        temp = "";
                        for (; z < am[i].length(); z++)
                        {
                            if (am[i].charAt(z) != '+' && am[i].charAt(z) != '-' && am[i].charAt(z) != '*' && am[i].charAt(z) != '/')
                            {
                                temp += am[i].charAt(z);
                            }
                            else
                            {
                                if (temp != "" && phep != 'n')
                                {
                                    switch (phep)
                                    {
                                        case '+':
                                            bientam += Float.parseFloat(temp);
                                            break;
                                        case '-':
                                            bientam -= Float.parseFloat(temp);
                                            break;
                                        case '*':
                                            bientam *= Float.parseFloat(temp);
                                            break;
                                        case '/':
                                            bientam /= Float.parseFloat(temp);
                                            break;
                                        default:
                                            break;
                                    };
                                }
                                phep = am[i].charAt(z);
                                temp = "";
                            }

                        }
                        if (z == am[i].length())
                        {
                            if (temp != "")
                            {
                                if (phep == '*')
                                {
                                    bientam = bientam * Float.parseFloat(temp);
                                }
                                if (phep =='/')
                                {
                                    bientam = bientam / Float.parseFloat(temp);
                                }
                            }
                        }
                        hieu += bientam;
                    }
                    else
                    {
                        hieu += Float.parseFloat(am[i]);
                    }
                }
                else
                    break;
            }
            return tong - hieu;
        }


    }
}




