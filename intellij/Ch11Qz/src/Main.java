public class Main {

    public static void main(String[] args) {
	// write your code here

        Student st[] = new Student[5];

        st[0] = new Undergraduate("홍길동1", 1001, "컴공", 1, 4.5, "보안");
        st[1] = new Undergraduate("홍길동2", 1002, "겜공", 3, 3.5, "게임");

        st[2] = new Graduate("홍길동3", 2001, "겜공", 3, 3, true, false);
        st[3] = new Graduate("홍길동3", 2002, "컴공", 2, 2, false, true);
        st[4] = new Graduate("홍길동4", 2003, "겜공", 1, 4, true, false);


        System.out.println("학부생 "+st[0].toString());
        System.out.println("학부생 "+st[1].toString());
        System.out.println("대학원생 "+st[2].toString());
        System.out.println("대학원생 "+st[3].toString());
        System.out.println("대학원생 "+st[4].toString());

    }
}
