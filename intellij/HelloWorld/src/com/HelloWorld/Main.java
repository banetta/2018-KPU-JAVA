package com.HelloWorld;
import java.util.Scanner;   //  Scanner Class Import Scanner 클래스를 포함시키는 문장
                            // Scanner는 자바 클래스 라이브러리의 일종으로 입력을 받을때 주로 사용한다.

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello World!!");

        // Add2 예제
        Scanner input = new Scanner(System.in); // Scanner Class 선언

        // 필요한 변수 선언
        int x;  //  첫번째 숫자 변수
        int y;  //  두번째 숫자 변수
        int sum;    // 두 수의 합으로 사용할 변수

        // 첫번째 숫자 입력
        System.out.print("첫번째 숫자를 입력하시오 : ");
        x = input.nextInt();    //  Scanner 객체인 input을 이용하여 사용자로부터 정수를 읽어들이는 문장

        // 두번째 숫자 입력
        System.out.print("두번째 숫자를 입력하시오 : ");
        y = input.nextInt();

        sum = x + y;    //  두 수의 합 입력

        //  두 수의 합 출력
        System.out.println("두 수의 합은 "+sum+"입니다.");

    }
}
