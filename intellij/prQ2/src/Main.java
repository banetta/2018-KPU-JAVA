import java.util.*;
public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner sc = new Scanner(System.in);

        Menu mu = new Menu();
        Contact con[] = new Contact[50];

        int count = 0;

        String tmpname, tmpemail, tmpgroup;

        while (true){
            switch (mu.IssueMenu()){
                case 1:
                    if (count == 50){
                        System.out.println("허용 연락처 갯수 초과");
                        break;
                    }
                    System.out.println("<< 연락처 정보 입력>>");
                    System.out.printf("이름 : ");
                    tmpname = sc.nextLine();
                    System.out.printf("이메일 : ");
                    tmpemail = sc.nextLine();
                    System.out.printf("그룹 : ");
                    tmpgroup = sc.nextLine();
                    con[count] = new Contact(tmpname,tmpemail,tmpgroup);

                    break;

                case 2:
                    System.out.println("------------------------------------------------");
                    System.out.println("이름          이메일                 그룹");
                    System.out.println("------------------------------------------------");
                    for (int i = 0; i <= count; i++){
                        con[i].showData();
                    }
                    System.out.println("------------------------------------------------");
                    break;

                case 0:
                    System.out.println("Program exit.");
                    return;

                default:
                    System.out.println("잘못 입력되었습니다. 다시입력하세요");
                    break;

            }
        }
    }
}
