package csms.download;

import csms.show.Showable;
import csms.user.UserManager;
import csms.content.ContentManager;
import csms.download.Download;;

public class DownloadManager implements Showable{
	
	private Download darr[];
	private int index=0;
	
	public DownloadManager(int n) {
		darr = new Download[n];
	}
	
	public void addDownload(Download dn) {
		darr[index++] = dn;
	}
	
	public void showAll() {
		for (int i = 0; i < index; i++) {
			System.out.println(i+1+", "+darr[i].toString());
		}
	}
	
	public void setDefault(UserManager um, ContentManager cm) {
		darr[index++] = new Download(index, um.findUserByName("김일출"), cm.findContentByTitle("전쟁과 평화"));
		darr[index++] = new Download(index, um.findUserByName("박일출"), cm.findContentByTitle("그해 겨울"));
		darr[index++] = new Download(index, um.findUserByName("이일출"), cm.findContentByTitle("미스터 선샤인 1화"));
		darr[index++] = new Download(index, um.findUserByName("강일출"), cm.findContentByTitle("미스터 선샤인 2화"));
		darr[index++] = new Download(index, um.findUserByName("노일출"), cm.findContentByTitle("한끼줍쇼 100회"));
		darr[index++] = new Download(index, um.findUserByName("장일출"), cm.findContentByTitle("걸어서 세계로 10회"));
	}
	


}
