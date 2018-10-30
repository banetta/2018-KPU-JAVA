package csms.download;

import csms.content.Content;
import csms.user.User;

public class Download {
	
	private int id;
	private User user;
	private Content content;
	
	public Download(int id, User user, Content content) {
		this.id = id;
		this.user = user;
		this.content = content;
	}

	public String toString() {
		return "(Download id="+this.id+", Name="+this.user.getName()+", Title="+this.content.getTitle()+", Size="+this.content.getSize()+", Cost="+this.content.charge()+")";
	}
	

}
