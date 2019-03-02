public class Contact {

    private String name;
    private String email;
    private String group;

    public Contact(String name, String email, String group){
        this.name = name;
        this.email = email;
        this.group = group;
    }

    public void printClass(){
        System.out.println("------------------------------------------------");
        System.out.println("이름          이메일                 그룹");
        System.out.println("------------------------------------------------");
        System.out.println(this.name+"      "+this.email+"      "+this.group);
        System.out.println("------------------------------------------------");
    }
}
