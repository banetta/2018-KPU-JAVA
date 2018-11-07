import javax.swing.*;
import java.awt.*;

public class MyBoxLayout extends JFrame {
    public MyBoxLayout(){
        setTitle("BoxLayoutTest");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();

        // Y축 방향으로 컴포넌트를 쌓는다.
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        makeButton(panel, "Button1");
        makeButton(panel, "Button2");
        makeButton(panel, "Button3");
        makeButton(panel, "B4");
        makeButton(panel, "Long Button5");
        add(panel);
        pack();
        setVisible(true);
    }
    private void makeButton(JPanel panel, String text) {
        JButton button = new JButton(text);
        button.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(button);
    }
}
