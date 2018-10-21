import csms.content.ContentManager;
import csms.download.DownloadManager;
import csms.user.User;
import csms.user.UserManager;

public class CSMS {

    public static void main(String[] args) {
	// write your code here
        UserManager um = new UserManager(100);

        //um.addUser();
        //um.showAll();

        ContentManager cm = new ContentManager(200);

        //cm.addContent();
        //cm.showAll();

        DownloadManager dm = new DownloadManager(300);

        dm.addDownload(um., cm);




    }
}
