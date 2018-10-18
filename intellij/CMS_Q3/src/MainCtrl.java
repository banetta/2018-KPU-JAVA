import cms.contact.ContactManager;
import cms.group.GroupManager;
import cms.show.Showable;


public class MainCtrl {

    public static void main(String[] args) {
        // write your code here
        ContactManager cm = new ContactManager(100);
        GroupManager gm = new GroupManager(100);
        Showable sh = new Showable();
        MainMenu mm = new MainMenu();

        while (true) {
            switch (mm.IssueMenu()) {
                case 1:
                    cm.addContact(gm, sh, true);
                    break;

                case 2:
                    cm.addContact(gm, sh, false);
                    break;

                case 3:
                    cm.findContact();
                    break;

                case 4:
                    sh.showAll(cm);
                    break;

                case 5:
                    gm.addGroup();
                    break;

                case 6:
                    sh.showAll(gm);
                    break;

                case 0:
                    System.out.println("Program exit");
                    return;

                default:
                    System.out.println("잘못 입력하였습니다.");
                    break;
            }
        }
    }
}
