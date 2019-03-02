import csms.content.ContentManager;
import csms.download.DownloadManager;
import csms.user.UserManager;

import java.util.Scanner;

public class CSMS {

    public class MainMenu{
        public int issueMenu(){
            Scanner sc = new Scanner(System.in);
            System.out.println(" ----------<MENU>-----------");
            System.out.printf("|   %d. %-18s   |\n", 1, "Show all users");
            System.out.printf("|   %d. %-18s   |\n", 2, "Show all content");
            System.out.printf("|   %d. %-18s   |\n", 3, "Show all downloads");
            System.out.println("|                           |");
            System.out.printf("|   %d. %-18s   |\n", 0, "Exit");
            System.out.println(" ---------------------------");
            System.out.printf("Your choice>> ");
            return sc.nextInt();
        }
    }

    private UserManager um;
    private ContentManager cm;
    private DownloadManager dm;
    private MainMenu mm;


    public void run(){
        while (true){
            switch (mm.issueMenu()) {
                case 1:
                    um.showAll();
                    break;
                case 2:
                    cm.showAll();
                    break;
                case 3:
                    dm.showAll();
                    break;
                case 0:
                    System.out.println("Program Exit.");
                    return;
                default:
                    System.out.println("Worng number Try again");
                    break;
            }
        }
    }

    CSMS(){
        um = new UserManager(200);
        cm = new ContentManager(100);
        dm = new DownloadManager(300);
        mm = new MainMenu();
    }

    public void setDefault(){
        um.setDefault();
        cm.setDefault();
        dm.setDefault(um, cm);

    }


}


