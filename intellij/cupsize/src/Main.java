import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here

        int size;

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("컵 사이즈를 입력하세요. : ");
            size = sc.nextInt();
            if (size == 99999){
                System.out.println("프로그램 종료");
                break;
            }

            if (size < 100) {
                System.out.println("small");
            } else if (size >= 100 && size < 200) {
                System.out.println("medium");
            } else if (size >= 200) {
                System.out.println("large");
            }
        }
        return;

    }
}
