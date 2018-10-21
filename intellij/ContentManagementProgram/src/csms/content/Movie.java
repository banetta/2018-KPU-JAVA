package csms.content;

public class Movie extends Content {

    private String Director;

    public Movie(int id, String title, int price, String director){
        super(id, title, price);
        this.Director = director;
    }

    public int getPrice(){
        int price;
        price = (this.getSize()-1000);

        return super.getPrice()+price;
    }

    public String getDirector(){return Director;}
    public String toString(){
        return "ID="+this.getId()+", "+this.getClass().getSimpleName()+", Title="+this.getTitle()+", Channel="+this.getDirector()+", Price="+this.getSize();
    }
}
