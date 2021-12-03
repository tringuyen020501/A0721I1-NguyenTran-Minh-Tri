package LTM;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Cau2_UDP_Server extends JFrame {
    public static boolean CheckDoiXung(String st) {
        String dao="";
        for (int i = st.length() -1; i >= 0; i--) {
            dao += st.charAt(i);
        }
        if(dao.equals(st)) return true;
        return false;
    }

    public static class DaLuong extends Thread {
        DatagramPacket receivePacket;
        public DaLuong(DatagramPacket receivePacket)
        {
            this.receivePacket=receivePacket;
        }
        public void run() {
            byte[] sendData = new byte[1024];
            try {
                taChat.setText(taChat.getText() + " Đăng nhập thành công»« Client \n[addr="+receivePacket.getAddress()
                        +", port="+receivePacket.getPort()+", localport="+serverSocket.getLocalPort()+"]:\n");


                InetAddress IPAddress = receivePacket.getAddress();
                int port = receivePacket.getPort();
                String st = new String(receivePacket.getData(), "UTF-8");
                st = st.trim();
                String ketQuaTraVe = "";
                if(CheckDoiXung(st)) {
                    ketQuaTraVe = "Server: True. " +st+ " Là chuỗi đối xứng"+". Stop!";
                } else {
                    ketQuaTraVe = "Server: False. " +st+ " Không phải là chuỗi đối xứng. Continue!";
                }
                taChat.setText(taChat.getText() + ketQuaTraVe+"\n");
                sendData = ketQuaTraVe.getBytes();
                DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, IPAddress, port);

                serverSocket.send(sendPacket);
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            this.stop();
        }
    }
    static JTextArea taChat;
    public Cau2_UDP_Server() {
        this.setTitle("Server");
        setDefaultCloseOperation(3);
        setBounds(100, 100, 618, 598);
        JPanel contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewLabel = new JLabel("Ket qua");
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblNewLabel.setBounds(268, 10, 68, 22);
        contentPane.add(lblNewLabel);

        taChat = new JTextArea();
        taChat.setEditable(false);
        taChat.setFont(new Font("Tahoma", Font.PLAIN, 13));

        JScrollPane scrollPane = new JScrollPane(taChat);
        scrollPane.setBounds(10, 48, 584, 503);
        contentPane.add(scrollPane);
        this.setVisible(true);
    }

    static DatagramSocket serverSocket;
    public static void main(String[] args) throws Exception{
        Cau2_UDP_Server cau2 = new Cau2_UDP_Server();
        taChat.setText(taChat.getText() + "Trạng thái server đang chạy, vui lòng chờ...\n");
        serverSocket = new DatagramSocket(2222);
        taChat.setText(taChat.getText() + "Đang chạy client...\n");
        while (true) {
            byte[] receiveData = new byte[1024];
            DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
            serverSocket.receive(receivePacket);
            new DaLuong(receivePacket).start();
        }
    }

}
