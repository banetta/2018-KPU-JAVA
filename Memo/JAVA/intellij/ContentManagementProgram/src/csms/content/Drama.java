package csms.content;

public class Drama extends Content {

    private String Channel;

    public Drama(int id, String title, int price, String channel) {
        super(id, title, price);
        this.Channel = channel;
    }

    public int getPrice(){
        int price = 0;
        price = (this.getSize() - 1000) * 2;

        if (price > 0)
            return 1000+price;
        else
            return 1000;
    }

    public String getChannel(){return Channel;}
    public String toString(){
        return "ID="+this.getId()+", "+this.getClass().getSimpleName()+", Title="+this.getTitle()+", Channel="+this.getChannel()+", Price="+this.getSize();
    }
}
