import javax.swing.*;
import java.awt.*;

public class MyGridLayout extends JFrame {
    public MyGridLayout() {

        setTitle("GridLayoutTest");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new GridLayout(0,3)); // 3개의 열과 필요한 만큼의 행

        add(new JButton("Button1"));
        add(new JButton("Button2"));
        add(new JButton("Button3"));
        add(new JButton("B4"));
        add(new JButton("Long Button5"));

        pack();
        setVisible(true);
    }
}
