import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        double c = 0;
        double f = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("섭씨(C) -> 화씨(F) 변환");

        while (true){
            System.out.print("섭씨(C)를 입력해주세요 : ");
            c = input.nextInt();

            f = c * 1.8 + 32;

            System.out.println("변환된 화씨(F)는 "+f+"입니다.");

            f = 0;
            c = 0;
        }
    }
}
