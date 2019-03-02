import csms.content.ContentManager;
import csms.download.DownloadManager;
import csms.user.UserManager;

public class MainCtrl {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		
		UserManager um = new UserManager(100);
		ContentManager cm = new ContentManager(200);
		DownloadManager dm = new DownloadManager(300);
		
		um.setDefault();
		cm.setDefault();
		dm.setDefault(um, cm);
		
		dm.showAll();
		
		

	}

}
