package csms.content;

public class Content {
    private int id;
    private String title;
    private int size;

    public Content(int id, String title, int size){
        this.id = id;
        this.title = title;
        this.size = size;
    }

    public int getId(){return id;}
    public String getTitle(){return title;}
    public int getSize(){return size;}
    public int getPrice(){
        return 1000;
    }

    public String toString() {
        return this.getClass().getName();
    }
}
