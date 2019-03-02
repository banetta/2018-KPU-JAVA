import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int receipt, pay = 0, change, quotient, remainder;

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("물건 값은? : ");
            receipt = sc.nextInt();
            if (receipt == 0) {
                System.out.println("프로그램을 종료합니다.");
                return;
            }

            while (true) {
                System.out.print("낸 금액은? : ");
                pay = sc.nextInt();
                if (pay < receipt){
                    System.out.println("금액이 부족합니다.");
                }
                else if (pay > receipt){
                    break;
                }
            }
                change = pay - receipt;

                System.out.println("거스름 총액 = "+change+"원");
                remainder = change / 50000;
                quotient = change % 50000;
                System.out.println("50000원권*"+remainder+"장 = "+(change - quotient)+"원");
                remainder = change / 10000;
                quotient = change % 10000;
                System.out.println("10000원권*"+remainder+"장 = "+remainder*10000+"원");
                remainder = change / 5000;
                System.out.println("5000원권*"+remainder+"장 = "+remainder*5000+"원");
                remainder = change / 1000;
                System.out.println("1000원권*"+remainder+"장 = "+remainder*1000+"원");
                remainder = change / 500;
                System.out.println("500원권*"+remainder+"장 = "+remainder*500+"원");
                remainder = change / 100;
                System.out.println("100원권*"+remainder+"장 = "+remainder*100+"원");
                remainder = change / 10;
                System.out.println("10원권*"+remainder+"장 = "+remainder*10+"원");
                remainder = change / 1;
                System.out.println("1원권*"+remainder+"장 = "+remainder*1+"원");
                break;
        }
        return;
    }
}
