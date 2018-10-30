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
		darr[index++] = new Download(index, um.findUserByName("������"), cm.findContentByTitle("����� ��ȭ"));
		darr[index++] = new Download(index, um.findUserByName("������"), cm.findContentByTitle("���� �ܿ�"));
		darr[index++] = new Download(index, um.findUserByName("������"), cm.findContentByTitle("�̽��� ������ 1ȭ"));
		darr[index++] = new Download(index, um.findUserByName("������"), cm.findContentByTitle("�̽��� ������ 2ȭ"));
		darr[index++] = new Download(index, um.findUserByName("������"), cm.findContentByTitle("�ѳ��ݼ� 100ȸ"));
		darr[index++] = new Download(index, um.findUserByName("������"), cm.findContentByTitle("�ɾ ����� 10ȸ"));
	}
	


}
