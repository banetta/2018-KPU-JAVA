public class Main {

    public static void main(String[] args) {
	// write your code here
        Menu mm = new Menu();
        MyFlowLayout m1 = null;
        MyBorderLayout m2 = null;
        MyBoxLayout m3 = null;
        MyGridLayout m4 = null;
        MyCardLayout m5 = null;
        MyAbsoluteLayout m6 = null;

        while (true)
        {
            switch (mm.issueMenu()){
                case 1:
                    if (m1 != null) m1.setVisible(true);
                    else m1 = new MyFlowLayout();
                    break;
                case 2:
                    if (m2 != null) m2.setVisible(true);
                    else m2 = new MyBorderLayout();
                    break;
                case 3:
                    if (m3 != null) m3.setVisible(true);
                    else m3 = new MyBoxLayout();
                    break;
                case 4:
                    if (m4 != null) m4.setVisible(true);
                    else m4 = new MyGridLayout();
                    break;
                case 5:
                    if (m5 != null) m5.setVisible(true);
                    else m5 = new MyCardLayout();
                    break;
                case 6:
                    if (m6 != null) m6.setVisible(true);
                    else m6 = new MyAbsoluteLayout();
                    break;
                case 0:
                    return;

            }
        }
    }
}
