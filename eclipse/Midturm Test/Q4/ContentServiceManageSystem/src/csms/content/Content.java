package csms.content;

public abstract class Content {
	
	final int BASE_SIZE = 1000;
	final int BASE_CHARGE = 1000;
	
	
	private int id;
	private String title;
	private String author;
	private int size;
	
	public Content(int id, String title, String author, int size) {
		this.id = id;
		this.title = title;
		this.author = author;
		this.size = size;
	}
	
	public abstract String toString();
	
	public int getID() {return id;}
	public String getTitle() {return title;}
	public String getAuthor() {return author;}
	public int getSize() {return size;}
	
	
}
