package csms.user;

public class UserManager {

    private User user[];
    private int index=0;

    public UserManager(int n){
        user = new User[n];
    }

    public void addUser(){
        user[index++] = new User(index, "홍길동");
        user[index++] = new User(index, "일길동");
        user[index++] = new User(index, "이길동");
        user[index++] = new User(index, "삼길동");
        user[index++] = new User(index, "사길동");
        user[index++] = new User(index, "오길동");
        user[index++] = new User(index, "육길동");
    }

    public void showAll(){
        for (int i = 0; i < index; i++)
            System.out.println(user[i].toString());
    }

}
