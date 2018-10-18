package cms.show;

import cms.contact.ContactManager;
import cms.group.GroupManager;

public class Showable {

    public void showAll(ContactManager cm) {
        System.out.println("--------------------------------------------------------------------");
        System.out.println("이름      이메일     그룹      주소");
        System.out.println("--------------------------------------------------------------------");
        cm.getAll();
        System.out.println("--------------------------------------------------------------------");
    }

    public void showAll(GroupManager gm){
        System.out.println("------------------------------------------------");
        System.out.println("Group ID    Group 이름");
        gm.getAll();
        System.out.println("------------------------------------------------");
    }
}
