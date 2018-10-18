package cms.group;
import java.util.Scanner;

public class GroupManager {

    Group gr[];
    int index=0;
    Scanner sc;

    public GroupManager(int n){
        gr = new Group[n];

        //  디폴트 목록 생성
        gr[index++] = new Group(index, "가족");
        gr[index++] = new Group(index, "과친구");
        gr[index++] = new Group(index, "중딩친구");
        gr[index++] = new Group(index, "고딩친구");
        gr[index++] = new Group(index, "구매사");
        gr[index++] = new Group(index, "고객사");
        gr[index++] = new Group(index, "대리점");
        sc = new Scanner(System.in);
    }

    public void addGroup(){

        String title;

        System.out.println("<< 연락처 그룹 정보 입력 >>");
        System.out.println(" - 그룹 ID : 자동생성");
        System.out.printf(" - 이름 : ");
        title = sc.nextLine();
        gr[index++] = new Group(index, title);
    }

    public void getAll() {
        for(int i=0; i< index; i++)
            gr[i].showData();
    }

    public String getTitle(int i){
        return gr[i-1].getTitle();
    }



}
