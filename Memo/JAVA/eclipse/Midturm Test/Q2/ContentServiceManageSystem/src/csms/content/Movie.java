package csms.content;


public class Movie extends Content {
	
	public Movie(int id, String title, String director, int size) {
		super(id, title, director, size);
	}
	public String toString() {
		return "(ID="+this.getID()+", Title="+this.getTitle()+", Director="+this.getAuthor()+", Size="+this.getSize()+")";
	}

}
