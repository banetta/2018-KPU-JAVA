import java.util.Scanner;

import csms.content.ContentManager;
import csms.download.DownloadManager;
import csms.user.UserManager;

public class CSMS {
	
	private UserManager um;
	private ContentManager cm;
	private DownloadManager dm;
	
	public class MainMenu {
				
		public int issueMenu() {
			Scanner sc = new Scanner(System.in);
			System.out.println(" -----------<MENU>----------- ");
			System.out.printf("|   %d. %-18s   |\n", 1, "Show all users");
			System.out.printf("|   %d. %-18s   |\n", 2, "Show all contents");
			System.out.printf("|   %d. %-18s   |\n", 3, "Show all downloads");
			System.out.println("|                           |");
			System.out.printf("|   %d. %-18s   |\n", 4, "Add a users");
			System.out.printf("|   %d. %-18s   |\n", 5, "Add a contents");
			System.out.printf("|   %d. %-18s   |\n", 6, "Add a downloads");
			System.out.println("|                           |");
			System.out.printf("|   %d. %-18s   |\n", 0, "Exit");
			System.out.println(" ---------------------------- ");
			System.out.print("Your Choice>> ");
			return sc.nextInt();
		}
	}
	
	public CSMS(){
		this.um = new UserManager(100);
		this.cm = new ContentManager(200);
		this.dm = new DownloadManager(300);
		
		um.setDefault();
		cm.setDefault();
		dm.setDefault(um, cm);
	}
	
	public void run() {
		MainMenu mm = new MainMenu();
		while(true) {
			switch (mm.issueMenu()) {
			case 1:
				um.showAll();
				break;
				
			case 2:
				cm.showAll();
				break;
				
			case 3:
				dm.showAll();
				break;
				
			case 4:
				um.toAddUser();
				break;
				
			case 5:
				break;
				
			case 6:
				break;
	
			case 0:
				System.out.println("Exit");
				return;
				
			default:
				System.out.println(">> No such menu...");
				break;
			}
		}
	}

}
