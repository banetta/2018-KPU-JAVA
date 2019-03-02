package csms.content;

public class ContentManager {
	
	private Movie marr[];
	private int index=0;
	
	public ContentManager(int n) {
		marr = new Movie[n];
	}
	
	public void addMovie(String title, String director, int size) {
		marr[index++] = new Movie(index, title, director, size);
	}
	
	public void showAll() {
		for (int i = 0; i < index; i++) {
			System.out.println(marr[i].toString());
		}
	}

}
