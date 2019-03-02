public class Main {

    public static void main(String[] args) {
	// write your code here
        String proverb = "A barking dog";   //  new 생략
        String s1, s2, s3, s4;  //  참조 변수로 메소드에 반환된 참조값을 받는다.

        System.out.println("문자열의 길이 : "+proverb.length());

        s1 = proverb.concat(" never Bites!");   //  문자열 결합
        s2 = proverb.replace('B', 'b'); //  문자 교환
        s3 = proverb.substring(2,5);    //  부분 문자열 추출
        s4 = proverb.toUpperCase(); //  대문자로 변환

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);

        String s5 = " ABC";
        String s6 = " ABC";

        //  if (s5.equals(s6)) System.out.println("True");
        if (s5 == s6) System.out.println("True");   //  다르다..? 달라야하는데 같다고나오는거같음
        else System.out.println("False");

        String s7 = new String("ABC");  // 문자열과 객체의 차이라고 보면될듯하다?
        String s8 = new String("ABC");

        if (s7 == s8) System.out.println("True");
        else System.out.println("False");
    }
}
