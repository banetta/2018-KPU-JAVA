package csms.content;

public class Show extends Content{
	
	final int EXTRA_PAY_PER_MB = 3;
	
	public Show(int id, String title, String Channel, int size) {
		super(id, title, Channel, size);
	}
	public int charge() {
		if (this.getSize() < BASE_SIZE) {
			return BASE_CHARGE;
		}
		else {
			return BASE_CHARGE + (this.getSize() - BASE_SIZE) * EXTRA_PAY_PER_MB;
		}
	}
	public String toString() {
		return "(ID="+this.getID()+", Show, "+", Title="+this.getTitle()+", Channel="+this.getAuthor()+", Price="+this.charge()+")";
	}

}
