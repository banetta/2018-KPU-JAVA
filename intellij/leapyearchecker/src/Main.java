import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int year;

        Scanner sc = new Scanner(System.in);
        System.out.println("윤년 검사기");

        while (true) {

            System.out.print("연도를 입력하세요 : ");

            year = sc.nextInt();

            boolean isResult = ((year%4==0 && year%100!=0) || year%400==0);

            System.out.println(year + "는 " + isResult + "입니다.");
        }
    }
}
