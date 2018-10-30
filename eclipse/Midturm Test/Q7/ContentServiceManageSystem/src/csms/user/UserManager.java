package csms.user;

import java.util.Scanner;

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
	
	public User findUserByName(String name) {
		for (int i = 0; i < index; i++) {
			if (uarr[i].getName().equals(name)) {
				return uarr[i];
			}
		}
		return null;
	}
	
	public void setDefault() {
		uarr[index++] = new User(index, "김일출");
		uarr[index++] = new User(index, "박일출");
		uarr[index++] = new User(index, "이일출");
		uarr[index++] = new User(index, "강일출");
		uarr[index++] = new User(index, "노일출");
		uarr[index++] = new User(index, "정일출");
		uarr[index++] = new User(index, "장일출");
	}
	
	public void toAddUser() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println(">> To add a User...");
		System.out.print(" - name:");
		addUser(sc.next());
		
	}
}
