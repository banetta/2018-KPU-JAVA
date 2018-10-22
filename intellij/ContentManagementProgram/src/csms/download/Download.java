package csms.download;

import csms.content.Content;
import csms.user.User;

public class Download {

    private int id;
    private User user;
    private Content content;
    private int cost;

    public Download(int id, User user, Content content){
            this.id = id;
            this.user = user;
            this.content = content;
            if (content.equals(null))
                this.cost = 1000;
            else
                this.cost = content.getPrice();
    }

    public int getId() { return id; }
    public User getUser() {return user;}
    public Content getContent() {return content;}
    public int getCost(){ return cost;}

    public String toString(){
        if (this.user.equals(null) || this.content.equals(null))
            return "Download id="+this.getId()+"Error Class!!";
        return "Download id="+this.getId()+", Name="+user.getName()+", Title="+content.getTitle()+", Size="+content.getSize()+", Cost="+this.getCost();
    }
}
