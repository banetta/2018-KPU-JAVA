import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

class MyFrame extends JFrame implements KeyListener { // (1)

    public MyFrame() {
        setTitle("이벤트 예제");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextField tf = new JTextField(20);
        tf.addKeyListener(this); // (2)

        add(tf);
        setVisible(true);

    }

    public void keyTyped(KeyEvent e) { // (3)
        display(e, "KeyTyped ");
    }

    public void keyPressed(KeyEvent e) {
        display(e, "KeyPressed ");
    }

    public void keyReleased(KeyEvent e) {
        display(e, "Key Pressed ");
    }

    protected void display(KeyEvent e, String s) {
        char c = e.getKeyChar();
        int keyCode = e.getKeyCode();
        String modifiers = e.isAltDown() + " " + e.isControlDown() + " "
                + e.isShiftDown();
        System.out.println(s + " " + c + " " + keyCode + " " + modifiers);
    }
}

public class KeyEventTest {
    public static void main(String[] args) {
        MyFrame f = new MyFrame();
    }
}
