import java.io.*;
import java.net.*;

import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.*;



public class MessengerA {
    protected JTextField textField;
    protected JTextArea textArea;
    DatagramSocket socket;
    DatagramPacket packet;
    InetAddress address = null;
    final int myPort = 5000; // 수신용 포트 번호
    final int otherPort = 6000; // 송신용 포트 번호

    public MessengerA() throws IOException {
        MyFrame f = new MyFrame();
        address = InetAddress.getByName("127.0.0.1");
        socket = new DatagramSocket(myPort);
    }
    private static void addmsg(String msg) {
        Connection con = ConnectDatabase.makeConnection();
        try {
            Statement stmt = con.createStatement();
            String s = "INSERT INTO msg_log (msg) VALUES ";
            s += msg;
            System.out.println(s);
            int i = stmt.executeUpdate(s);
            if (i == 1)
                System.out.println("레코드 추가 성공");
            else
                System.out.println("레코드 추가 실패");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            System.exit(0);
        }
    }

    // 패킷을 받아서 텍스트 영역에 표시한다.
    public void process() {
        while (true) {
            try {
                byte[] buf = new byte[256];
                packet = new DatagramPacket(buf, buf.length);
                socket.receive(packet); // 패킷을 받는다.
                // 받은 패킷을 텍스트 영역에 표시한다.
                textArea.append("RECIEVED: " + new String(buf) + "\n");
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        }
    }

    // 내부 클래스 정의
    class MyFrame extends JFrame implements ActionListener {

        public MyFrame() {
            super("MessengerA");
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            textField = new JTextField(30);
            textField.addActionListener(this);

            textArea = new JTextArea(10, 30);
            textArea.setEditable(false);

            add(textField, BorderLayout.PAGE_END);
            add(textArea, BorderLayout.CENTER);
            pack();
            setVisible(true);
        }

        public void actionPerformed(ActionEvent evt) {
            String s = textField.getText();
            byte[] buffer = s.getBytes();
            DatagramPacket packet;

            // 패킷을 생성한다.
            packet = new DatagramPacket(buffer, buffer.length, address,
                    otherPort);
            try {
                socket.send(packet); // 패킷을 보낸다.
                addmsg(s);
            } catch (IOException e) {
                e.printStackTrace();
            }
            textArea.append("SENT: " + s + "\n");
            textField.selectAll();
            textArea.setCaretPosition(textArea.getDocument().getLength());
        }
    }

    public static void main(String[] args) throws IOException {
        MessengerA m = new MessengerA();
        m.process();
    }
}
