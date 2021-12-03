package LTM;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.*;

public class Cau2_UDP_Client extends JFrame{
    static JTextArea triKetQua;
    JTextField tfSo;
    static JButton btnSend;

    public Cau2_UDP_Client() {
        this.setTitle("Client");
        setDefaultCloseOperation(3);
        setBounds(100, 100, 453, 522);
        JPanel contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel jlbKetQua = new JLabel("kết quả ");
        jlbKetQua.setFont(new Font("Tahoma", Font.PLAIN, 16));
        jlbKetQua.setBounds(165, 116, 107, 20);
        contentPane.add(jlbKetQua);

        JTextArea taKetQua = new JTextArea();
        taKetQua.setEditable(false);
        taKetQua.setFont(new Font("Tahoma", Font.PLAIN, 12));
        JScrollPane scroll = new JScrollPane(taKetQua);
        scroll.setBounds(25, 146, 390, 309);
        contentPane.add(scroll);

        tfSo = new JTextField();
        tfSo.setFont(new Font("Tahoma", Font.PLAIN, 16));
        tfSo.setBounds(216, 27, 117, 30);
        contentPane.add(tfSo);
        tfSo.setColumns(10);

        JLabel lb1 = new JLabel("nhập chuỗi:");
        lb1.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lb1.setBounds(100, 35, 89, 20);
        contentPane.add(lb1);

        btnSend = new JButton("Send");
        btnSend.setFont(new Font("Tahoma", Font.PLAIN, 16));
        btnSend.setBounds(176, 67, 85, 30);
        btnSend.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                DatagramSocket clientSocket=null;
                InetAddress IpAddress=null;
                try {
                    clientSocket = new DatagramSocket();
                    IpAddress = InetAddress.getByName("localhost");
                    String str = "";
                    byte[] receiveData = new byte[1024];
                    byte[] sendData = new byte[1024];
                    String st = tfSo.getText();
                    taKetQua.setText(taKetQua.getText()+"Client: "+st+"\n");
                    sendData = st.getBytes();
                    DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, IpAddress, 2222);
                    clientSocket.send(sendPacket);
                    DatagramPacket receivePacket = new DatagramPacket(receiveData,receiveData.length);
                    clientSocket.receive(receivePacket);
                    str = new String(receivePacket.getData(), "UTF-8");
                    str = str.trim();
                    taKetQua.setText(taKetQua.getText()+str+"\n");
                    if(str.endsWith("Stop!")) btnSend.setEnabled(false);
                    clientSocket.close();
                } catch (SocketException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                } catch (UnknownHostException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                } catch (IOException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }
            }
        });
        contentPane.add(btnSend);
        this.setVisible(true);
    }

    public static void main(String[] args) throws Exception{
        Cau2_UDP_Client client = new Cau2_UDP_Client();
    }

}
