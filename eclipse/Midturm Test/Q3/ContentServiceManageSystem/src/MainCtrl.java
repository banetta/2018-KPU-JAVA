import csms.content.ContentManager;
import csms.content.Movie;
import csms.user.UserManager;

public class MainCtrl {

	public static void main(String[] args) {
		// TODO �ڵ� ������ �޼ҵ� ����
		
		UserManager um = new UserManager(100);
		
		um.addUser("������");
		um.addUser("������");
		um.addUser("������");
		um.addUser("������");
		um.addUser("������");
		um.addUser("������");
		um.addUser("������");
		
		um.showAll();

	}

}
