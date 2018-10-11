public class Contact {

    private String name;
    private String email;
    private String group;

    public Contact(String name, String email, String group){
        this.name = name;
        this.email = email;
        this.group = group;
    }

    public void showData(){
        System.out.println(name+"  "+email+"  "+group);
    }
}
