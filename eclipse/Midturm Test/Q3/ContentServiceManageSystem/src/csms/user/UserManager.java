package csms.user;

import csms.show.Showable;

public class UserManager implements Showable{

	private User uarr[];
	private int index=0;
	
	public UserManager(int n) {
		uarr = new User[n];
	}
	
	public void addUser(String name) {
		uarr[index++] = new User(index, name);
	}
	
	public void showAll() {
		for (int i = 0; i < index; i++) {
			System.out.println(uarr[i].toString());
		}
	}
}
