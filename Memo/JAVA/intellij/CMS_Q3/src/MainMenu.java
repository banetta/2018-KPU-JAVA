import java.util.Scanner;

public class MainMenu {

    public int IssueMenu(){

        Scanner sc = new Scanner(System.in);
        System.out.println("------ 메 뉴 ------");
        System.out.println("1. 기본 연락처 추가");
        System.out.println("2. 상세 연락처 추가");
        System.out.println("3. 연락처 조회");
        System.out.println("4. 연락처 목록 출력");
        System.out.println("5. 연락처 그룹 추가");
        System.out.println("6. 연락처 그룹 출력");
        System.out.println();
        System.out.println("0. 종료");
        System.out.println("-----------------");
        System.out.print("선택>> ");
        return sc.nextInt();

    }
}
