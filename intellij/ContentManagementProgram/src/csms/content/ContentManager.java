package csms.content;

public class ContentManager {

    private Content cont[];
    private int index=0;

    public ContentManager(int n){
        cont = new Content[n];
    }

    public void addContent(){
        cont[index++] = new Movie(index, "전쟁과 평화", 1000, "톨스토이");
        cont[index++] = new Movie(index, "그해 겨울", 1100, "박완서");
        cont[index++] = new Drama(index, "미스터 선샤인 1화", 1400, "tvN");
        cont[index++] = new Drama(index, "미스터 선샤인 2화", 1600, "tvN");
        cont[index++] = new Drama(index, "미스터 선샤인 3화", 2000, "tvN");
        cont[index++] = new Show(index, "한끼줍쇼 100회", 1000, "jtbc");
        cont[index++] = new Show(index, "걸어서 세계로 10회", 4000, "MDC");
    }

    public int toPrice(int i){
        return cont[i].getPrice();
    }

    public void showAll(){
        for (int i=0; i<index; i++)
            System.out.println(cont[i].toString());
    }
}
