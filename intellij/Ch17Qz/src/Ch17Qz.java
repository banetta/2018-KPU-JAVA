import java.awt.*;
import java.awt.event.*;
import java.text.ParseException;

import javax.swing.*;
import javax.swing.text.MaskFormatter;

class MyFrame extends JFrame implements ActionListener {
    protected JTextField id;
    protected JPasswordField password;
    JCheckBox buttons = new JCheckBox("로그인 상태 유지");
    protected JTextArea textArea;

    public MyFrame() throws ParseException {
        super("My Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 3));

        id = new JTextField(15);
        id.addActionListener(this);
        panel.add(new JLabel("이메일 : "));
        panel.add(id);

        password = new JPasswordField(15);
        password.addActionListener(this);
        panel.add(new JLabel("비밀번호 : "));
        panel.add(password);


        textArea = new JTextArea(1, 1); // 텍스트 영역 생성
        textArea.setEditable(false); // 편집 불가로 설정

        add(panel, BorderLayout.NORTH); // 프레임의 북쪽에 배치
        add(buttons);
        add(textArea, BorderLayout.SOUTH); // 프레임의 남쪽에 배치
        pack();
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String emailVal = id.getText();
        String pwdVal = password.getText();
        if  (emailVal.equals("abc") && pwdVal.equals("1111"))
        {
            if(buttons.isSelected())
                    textArea.setText("로그인 성공 - 로그인 상태 유지");
            else
                    textArea.setText("로그인 성공");

        }
        else
            textArea.setText("로그인 실패");
    }
}

public class Ch17Qz {
    public static void main(String[] args) throws ParseException {
        MyFrame frame = new MyFrame();
    }
}
