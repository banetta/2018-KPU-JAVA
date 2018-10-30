package csms.content;


public class Movie extends Content {
	
	public Movie(int id, String title, String director, int size) {
		super(id, title, director, size);
	}
	
	public int charge() {
		if (this.getSize() < BASE_SIZE) {
			return BASE_CHARGE;
		}
		else {
			return BASE_CHARGE + (this.getSize() - BASE_SIZE);
		}
	}
	
	public String toString() {
		return "(ID="+this.getID()+", Movie, "+", Title="+this.getTitle()+", Director="+this.getAuthor()+", Price="+this.charge()+")";
	}

}
