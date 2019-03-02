import csms.content.ContentManager;
import csms.content.Movie;
import csms.user.UserManager;

public class MainCtrl {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		
		UserManager um = new UserManager(100);
		
		um.addUser("김일출");
		um.addUser("박일출");
		um.addUser("이일출");
		um.addUser("강일출");
		um.addUser("노일출");
		um.addUser("정일출");
		um.addUser("장일출");
		
		um.showAll();

	}

}
