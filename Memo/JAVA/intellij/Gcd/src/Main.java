import java.util.*;
public class Main {

    public static void main(String[] args) {
	// write your code here
        int x,y,r;
        System.out.print("두 개의 정수를 입력하시오(큰수, 작은수) : ");
        Scanner sc = new Scanner(System.in);

        x = sc.nextInt();
        y = sc.nextInt();

        while (y != 0){
            r = x % y;
            x = y;
            y = r;
        }
        System.out.printf("최대 공약수는 %d입니다.\n", x);
    }
}
