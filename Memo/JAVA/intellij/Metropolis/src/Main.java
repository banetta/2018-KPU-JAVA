import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        boolean isCapital;
        int citizens;
        int riches;

        Scanner input = new Scanner(System.in);

        System.out.print("수도입니까?(수도: 1 수도아님 : 0) :");
        isCapital = (input.nextInt() == 1) ? true : false;
        System.out.print("인구(단위 : 백만) :");
        citizens = input.nextInt();
        System.out.print("부자의 수(단위 : 백만) :");
        riches = input.nextInt();

        boolean isMetro = (isCapital && citizens >= 100) || (isCapital && riches >= 50);

        System.out.print("메트로폴리스 여부 : "+isMetro);

        return;
    }
}
