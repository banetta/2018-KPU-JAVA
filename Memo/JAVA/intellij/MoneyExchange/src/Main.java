import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	// write your code here
        int won;
        double dollar = 1111.38;
        double exchange;

        Scanner input = new Scanner(System.in);

        System.out.print("변환할 원화를 입력해주세요 : ");
        won = input.nextInt();

        exchange = won / dollar;

        System.out.println("변환된 달러는 "+exchange+"입니다.");


    }
}
