import csms.content.ContentManager;
import csms.content.Movie;

public class MainCtrl {

	public static void main(String[] args) {
		// TODO �ڵ� ������ �޼ҵ� ����
		
		ContentManager cm = new ContentManager(200);
		
		cm.addMovie("����� ��ȭ", 	"�罺����", 1000);
		cm.addMovie("���� �ܿ�", "�ڿϼ�", 1100);
		
		cm.showAll();		

	}

}
