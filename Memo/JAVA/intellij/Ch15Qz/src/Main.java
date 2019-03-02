import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class MyPanel extends JPanel implements ActionListener {
    JButton button;
    Color color = new Color(0, 0, 0);
    int light_number = 0;


    public MyPanel() {
        setLayout(new BorderLayout());
        button = new JButton("색상 변경");
        button.addActionListener(this);
        add(button, BorderLayout.SOUTH);
    }


    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        g.drawOval(100,100,100,100);
        if (light_number == 0){
            g.setColor(Color.RED);
        }
        else if (light_number == 1) {
            g.setColor(Color.GREEN);
        }
        else { g.setColor(Color.YELLOW); }

        g.fillOval(100,100,100,100);

    }

    public void actionPerformed(ActionEvent e) {
        if (++light_number >= 3)
            light_number = 0;

        repaint();
    }
}

public class Main extends JFrame {
    public Main() {
        setSize(150, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Color Test");
        setVisible(true);
        JPanel panel = new MyPanel();
        add(panel);
    }

    public static void main(String[] args) {
        Main s = new Main();
    }

}