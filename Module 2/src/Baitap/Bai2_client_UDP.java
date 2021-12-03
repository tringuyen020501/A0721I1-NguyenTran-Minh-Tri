package Baitap;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.UnknownHostException;
public class Bai2_client_UDP extends JFrame
{
    JTextArea tArea = new JTextArea();
    byte[] sendData = new byte[1024];
    public static void main(String[] args) throws UnknownHostException, IOException
    {
        // TODO Auto-generated method stub
        new Bai2_client_UDP();

    }
    public Bai2_client_UDP() throws IOException
    {
        DatagramSocket clientSocket = new DatagramSocket();
        Thread t = new Thread(new threadclient(clientSocket));
        t.start();
        InetAddress ipAdd  = InetAddress.getByName("localhost");
        this.setTitle("Client");
        this.setSize(600,400);
        this.setDefaultCloseOperation(3);
        this.setLayout(new BorderLayout());
        JPanel panel = new JPanel(new FlowLayout());
        panel.setPreferredSize(new Dimension(600, 70));
        JLabel lb = new JLabel("Nhap cong : ");
        JTextField tfCong = new JTextField("7788");
        tfCong.setColumns(7);
        JTextField tf = new JTextField("");
        tf.setColumns(29);
        JButton sendButton = new JButton("send");
        panel.add(lb); panel.add(tfCong);  panel.add(tf); panel.add(sendButton);
        this.add(panel,BorderLayout.NORTH);
        this.add(tArea,BorderLayout.CENTER);
        sendButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {

                // TODO Auto-generated method stub
                sendData = tf.getText().getBytes();
                int port = Integer.parseInt(tfCong.getText());
                DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length,ipAdd,port);
                try {
                    clientSocket.send(sendPacket);
                } catch (IOException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }
            }
        });
        this.setVisible(true);
    }
    class threadclient implements Runnable
    {
        DatagramSocket sk;
        byte[] receiveData = new byte[1024];
        DatagramPacket receivePacket = new DatagramPacket(receiveData,receiveData.length);
        public threadclient(DatagramSocket sk )
        {
            this.sk = sk;
        }
        @Override
        public void run() {
            // TODO Auto-generated method stub
            while(true)
            {
                try {
                    this.sk.receive(receivePacket);
                    String msg = new String(receivePacket.getData(),"UTF-8");

                    tArea.setText("ket qua :"+msg);

                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
    }
}














