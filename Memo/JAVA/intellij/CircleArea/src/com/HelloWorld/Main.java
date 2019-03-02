package com.HelloWorld;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        double radius;  //  원의 반지름
        double area;    //  원의 면적

        Scanner input = new Scanner(System.in); //  Scanner 선언
        System.out.print("반지름을 입력하시오 : ");  //  입력 안내 출력
        radius = input.nextDouble();    //  반지름 입력
        area = 3.14*radius*radius;  //  원의 면적 계산

        System.out.println(area);   //  원의 면적 출력
    }
}
