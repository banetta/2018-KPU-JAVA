package cms.group;

public class Group {
    private int id;
    private String title;

    public Group(int id, String title) {
        this.id = id;
        this.title = title;
    }

    public void showData() {
        System.out.println(id+"     "+title);
    }

    public String getTitle(){
        return title;
    }
}
