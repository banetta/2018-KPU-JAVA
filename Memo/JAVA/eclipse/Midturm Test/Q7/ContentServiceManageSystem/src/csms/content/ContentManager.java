package csms.content;

import java.util.Scanner;

import csms.show.Showable;

public class ContentManager implements Showable{
	
	private Content carr[];
	private int index=0;
	
	public ContentManager(int n) {
		carr = new Content[n];
	}
	
	public void addContent(Content cont) {
		carr[index++] = cont;
	}
	
	public void showAll() {
		for (int i = 0; i < index; i++) {
			System.out.println(carr[i].toString());
		}
	}
	
	public void setDefault() {
		carr[index++] = new Movie(index, "전쟁과 평화", "톨스토이", 1000);
		carr[index++] = new Movie(index, "그해 겨울", "박완서", 1100);
		carr[index++] = new Drama(index, "미스터 선샤인 1화", "tvN", 1200);
		carr[index++] = new Drama(index, "미스터 선샤인 2화", "tvN", 1300);
		carr[index++] = new Drama(index, "미스터 선샤인 3화", "tvN", 1500);
		carr[index++] = new Show(index, "한끼줍쇼 100회", "jtbc", 900);
		carr[index++] = new Show(index, "걸어서 세계로 10회", "MDC", 2000);
	}
	
	public Content findContentByTitle(String content) {
		for (int i = 0; i < index; i++) {
			if (carr[i].getTitle().equals(content)) {
				return carr[i];
			}
		}
		return null;
	}
	
	public void toAddContent() {
		Scanner sc = new Scanner(System.in);
		String temp;
		
		System.out.println(" -----------<MENU>----------- ");
		System.out.printf("|   %d. %-18s   |\n", 1, "Movie");
		System.out.printf("|   %d. %-18s   |\n", 2, "Drama");
		System.out.printf("|   %d. %-18s   |\n", 3, "Show");
		System.out.printf("|   %d. %-18s   |\n", 0, "Cancel");
		System.out.println(" ---------------------------- ");
		System.out.println(">> Witch?");
		switch (sc.nextInt()) {
		case 1:			
			System.out.println(">> To add a Movie...");
			System.out.println(" - title:");
			temp = sc.next();
			
			break;
			
		case 2:
			

		default:
			break;
		}
	
		
	}

}
