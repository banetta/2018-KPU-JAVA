import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	// write your code here
        int won;
        double dollar = 1111.38;
        double exchange;

        Scanner input = new Scanner(System.in);

        System.out.print("��ȯ�� ��ȭ�� �Է����ּ��� : ");
        won = input.nextInt();

        exchange = won / dollar;

        System.out.println("��ȯ�� �޷��� "+exchange+"�Դϴ�.");


    }
}
