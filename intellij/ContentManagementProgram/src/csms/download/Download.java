package csms.download;

import csms.content.Content;
import csms.user.User;

public class Download {

    private int id;
    private User user;
    private Content content;
    private int cost;

    public Download(int id, User user, Content content, int cost){

        this.id = id;
        this.user = user;
        this.content = content;
        this.cost = cost;

    }

    public int getId() { return id; }
    public User getUser() {return user;}
    public Content getContent() {return content;}
    public int getCost(){ return cost;}

    public String toString(){
        return "Download id="+this.getId()+", Name="+user.getName()+", Title="+content.getTitle()+", Size="+content.getSize()+", Cost="+this.getCost();
    }
}
