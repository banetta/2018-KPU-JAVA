import java.awt.*;
import javax.swing.*;

class MyFrame extends JFrame {

    public MyFrame() {
        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension screenSize = kit.getScreenSize();
        setSize(300, 200);
        setLocation(screenSize.width / 2, screenSize.height / 2);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("MyFrame");
        Image img = kit.getImage("icon.gif");
        setIconImage(img);
        setLayout(new FlowLayout());
        JButton button = new JButton("버튼");
        this.add(button);
        setVisible(true);
    }
}

public class MyFrameTest2 {
    public static void main(String[] args) {
	// write your code here
        MyFrame f = new MyFrame();
    }
}
