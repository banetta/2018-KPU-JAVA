import java.awt.*;
import javax.swing.*;

class MyFrame extends JFrame {
    public MyFrame() {
        setSize(500, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("테스트 프레임");

        JPanel panel = new JPanel();
        JTextField t1 = new JTextField(10);
        JTextField t2 = new JTextField(10);
        t2.setEditable(false);

        // 컴포넌트를 패널에 추가
        panel.add(t1);
        panel.add(t2);

        add(panel); // 패널을 프레임에 추가
        setVisible(true);
    }
}

public class MyFrameTest5 {
    public static void main(String[] args) {
        MyFrame f = new MyFrame();
    }
}
