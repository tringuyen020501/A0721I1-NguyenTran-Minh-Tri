package Baitap;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
public class Bai2_client_TCP extends JFrame
{
    private Socket socket=null ;
    private DataInputStream din =null;
    private DataOutputStream dos = null;

    public static void main(String[] args) throws UnknownHostException, IOException
    {
        // TODO Auto-generated method stub
        new Bai2_client_TCP();

    }
    public Bai2_client_TCP() throws IOException
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
        panel.add(lb); panel.add(tfCong); panel.add(conButton); panel.add(cloButton); panel.add(tf); panel.add(sendButton);
        this.add(panel,BorderLayout.NORTH);
        JTextArea tArea = new JTextArea();
        this.add(tArea,BorderLayout.CENTER);
        conButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                if(tfCong.getText()!="")
                {
                    int cong = Integer.parseInt(tfCong.getText());
                    try {
                        if(socket!=null)
                        {
                            socket.close();
                            din.close();
                            dos.close();
                        }
                        socket = new Socket("localhost",cong);
                        tArea.setText("ket noi toi server thanh cong !");
                        din = new DataInputStream(socket.getInputStream());
                        dos = new DataOutputStream(socket.getOutputStream());
                    } catch (IOException e1) {
                        // TODO Auto-generated catch block
                        e1.printStackTrace();
                        tArea.setText("khong ket noi duoc server / kiem tra lai cong ket noi");
                    }
                    cloButton.setEnabled(true);
                    conButton.setEnabled(false);
                }

            }
        });
        sendButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {

                // TODO Auto-generated method stub
                try {

                    String msg = tf.getText();
                    dos.writeUTF(msg);
                    dos.flush();
                    msg= din.readUTF();
                    tArea.setText("ket qua :" +msg);
                }
                catch (Exception a)
                {
                    // TODO: handle exception
                }
            }
        });
        cloButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {

                // TODO Auto-generated method stub
                try {
                    if(socket!=null)
                    {
                        socket.close();
                        din.close();
                        dos.close();
                    }
                }
                catch (Exception a)
                {
                    // TODO: handle exception
                }
                cloButton.setEnabled(false);
                conButton.setEnabled(true);
            }

        });
        this.setVisible(true);
    }
}









