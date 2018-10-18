package cms.contact;
import cms.group.GroupManager;
import cms.show.Showable;

import java.util.Scanner;

public class ContactManager{

    //Contact carr[];
    BasicContact bcon[];
    FullContact fcon[];
    int bindex=0;
    int findex=0;
    Scanner sc;

    public ContactManager(int n)
    {
        bcon = new BasicContact[n];
        fcon = new FullContact[n];
        sc = new Scanner(System.in);
    }

    public void addContact(GroupManager gm, Showable sh, boolean basic) {
            String name, email, addr = "default";
            int group;

            System.out.println("<<Contact 정보 입력>>");
            System.out.print(" - 이 름: ");
            name = sc.next();
            System.out.print(" - 이메일: ");
            email = sc.next();

            if (basic == false) {

                System.out.print(" - 주소: ");
                addr = sc.next();
            }

            sh.showAll(gm);
            System.out.print(" - 그 룹: ");
            group = sc.nextInt();

            if (basic == true)
                bcon[bindex++] = new BasicContact(name, email, gm.getTitle(group));
            if (basic == false)
                fcon[findex++] = new FullContact(name, email, gm.getTitle(group), addr);
    }

    public void getAll() {
        for(int i=0; i< bindex; i++)
            bcon[i].showData();
        for(int i=0; i< findex; i++)
            fcon[i].showData();
    }

    public void findContact(){
        String temp;
        String input;
        System.out.printf("검색 이름>> ");
        input = sc.next();

        System.out.println("------------------------------------------------------------------");
        System.out.println("이름      이메일     그룹      주소");
        System.out.println("------------------------------------------------------------------");
        for(int i=0; i< bindex; i++) {
            temp = bcon[i].getName();
            if (input.equals(temp))
                bcon[i].showData();
        }
        for(int i=0; i< findex; i++) {
            temp = fcon[i].getName();
            if (input.equals(temp))
                fcon[i].showData();
        }
        System.out.println("                        Serch Complete");
        System.out.println("------------------------------------------------------------------");

    }
}
