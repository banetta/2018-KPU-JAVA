package csms.content;

import csms.show.Showable;

public class ContentManager implements Showable {

    private Content cont[];
    private int index=0;

    public ContentManager(int n){
        cont = new Content[n];
    }

    public void addContent(String genre, String title, int price, String etc){

        if (genre.equals("Movie"))
            cont[index++] = new Movie(index, title, price, etc);
        else if (genre.equals("Drama"))
            cont[index++] = new Drama(index, title, price, etc);
        else if (genre.equals("Show"))
            cont[index++] = new Show(index, title, price, etc);
    }

    public Content findContentByTitle (String title){
        String temp;
        for (int i = 0; i<index; i++) {
            temp = cont[i].getTitle();
            if (title.equals(temp))
                return cont[i];
        }
        return null;
    }

    public int toPrice(int i){
        return cont[i].getPrice();
    }

    public void showAll(){
        for (int i=0; i<index; i++)
            System.out.println(cont[i].toString());
    }

    public void setDefault(){
        addContent("Movie", "전쟁과 평화", 1000, "톨스토이");
        addContent("Movie", "그해 겨울", 1100, "박완서");
        addContent("Drama", "미스터 선샤인 1화", 1200, "tvN");
        addContent("Drama", "미스터 선샤인 2화", 1300, "tvN");
        addContent("Drama", "미스터 선샤인 3화", 2000, "tvN");
        addContent("Show", "한끼줍쇼 100회", 900, "jtbc");
        addContent("Show", "걸어서 세계로 10회", 2000, "MDC");
    }
}
