package csms.download;

import csms.content.ContentManager;
import csms.show.Showable;
import csms.user.UserManager;

public class DownloadManager implements Showable {

    private Download download[];
    private int index=0;

    public DownloadManager(int n){
        download = new Download[n];
    }

    public void addDownload(UserManager um, ContentManager cm, String name, String title){

        download[index++] = new Download(index, um.findUserByName(name), cm.findContentByTitle(title));
    }
    public void showAll(){
        for (int i = 0; i < index; i++)
            System.out.println(download[i].toString());
    }

    public void setDefault(UserManager um, ContentManager cm){

        addDownload(um, cm, "홍길동", "전쟁과 평화");
        addDownload(um, cm, "일길동", "그해 겨울");
        addDownload(um, cm, "이길동", "미스터 선샤인 1화");
        addDownload(um, cm, "삼길동", "미스터 선샤인 2화");
        addDownload(um, cm, "사길동", "한끼줍쇼 100회");
        addDownload(um, cm, "오길동", "걸어서 세계로 10회");
    }
}
