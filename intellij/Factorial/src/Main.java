import java.util.*;
public class Main {

    public static void main(String[] args) {
	// write your code here

        long fact = 1;
        int n;

        System.out.print("정수를 입력하시오 : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for (int i = 1; i <= n; i++){
            fact = fact * i;
        }

        System.out.printf("%d!은 %d 입니다.\n", n, fact);

        return;

    }
}
