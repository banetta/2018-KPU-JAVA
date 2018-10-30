package csms.user;

public class User {
	
	private int id;
	private String name;
	
	public User(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public int getID() {return id;}
	public String getName() {return name;}
	
	public String toString() {
		return "(ID="+this.getID()+", Name="+this.getName()+")";
	}

}
