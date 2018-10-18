import java.util.*;
public class Menu {

    public int IssueMenu(){

        Scanner sc = new Scanner(System.in);
        System.out.println("------ 메 뉴 ------");
        System.out.println("1. 연락처 추가");
        System.out.println("2. 연락처 조회");
        System.out.println("3. 연락처 목록 출력");
        System.out.println();
        System.out.println("0. 종료");
        System.out.println("-----------------");
        System.out.print("선택>> ");
        return sc.nextInt();

    }
}
