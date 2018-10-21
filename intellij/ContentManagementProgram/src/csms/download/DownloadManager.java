package csms.download;

import csms.content.Content;
import csms.content.ContentManager;
import csms.user.User;
import csms.user.UserManager;

public class DownloadManager {

    private Download download[];
    private int index=0;

    public DownloadManager(int n){
        download = new Download[n];
    }

    public void addDownload(UserManager um[], ContentManager cm[]){

        download[index++] = new Download(index, um[1], cm[2], );
        download[index++] = new Download(index, um[2], cm[1], );
        download[index++] = new Download(index, um[3], cm[0], );
        download[index++] = new Download(index, um[2], cm[3], );
        download[index++] = new Download(index, um[5], cm[4], );
        download[index++] = new Download(index, um[6], cm[5], );
    }
}
