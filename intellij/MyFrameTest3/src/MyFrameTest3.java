import javax.swing.*;

class MyFrame extends JFrame {
    public MyFrame() {
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("MyFrame");

        JPanel panel = new JPanel(); // 패널 생성
        JLabel label = new JLabel("안녕하세요?"); // 레이블 생성
        JButton button = new JButton("버튼"); // 버튼 생성
        panel.add(label); // 패널에 레이블 추가
        panel.add(button); // 패널에 버튼 추가
        add(panel); // 패널을 프레임에 추가
        setVisible(true);
    }
}

public class MyFrameTest3 {
    public static void main(String[] args) {
        MyFrame f = new MyFrame();
    }
}
