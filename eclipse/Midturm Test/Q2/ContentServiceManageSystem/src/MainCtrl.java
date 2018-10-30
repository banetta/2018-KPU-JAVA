import csms.content.ContentManager;
import csms.content.Movie;

public class MainCtrl {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		
		ContentManager cm = new ContentManager(200);
		
		cm.addMovie("전쟁과 평화", 	"톨스토이", 1000);
		cm.addMovie("그해 겨울", "박완서", 1100);
		
		cm.showAll();		

	}

}
