package csms.user;

import csms.show.Showable;

public class UserManager implements Showable {

    private User user[];
    private int index=0;

    public UserManager(int n){
        user = new User[n];
    }

    public void addUser(String name){
        user[index++] = new User(index, name);
    }

    public User findUserByName(String name){
        String temp;
        for (int i=0; i<index; i++) {
            temp = user[i].getName();
            if (name.equals(temp))
                return user[i];
        }
        return null;
    }

    public void showAll(){
        for (int i = 0; i < index; i++)
            System.out.println(user[i].toString());
    }

    public void setDefault(){
        addUser("홍길동");
        addUser("일길동");
        addUser("이길동");
        addUser("삼길동");
        addUser("사길동");
        addUser("오길동");
        addUser("육길동");
        addUser("칠길동");
    }

}
