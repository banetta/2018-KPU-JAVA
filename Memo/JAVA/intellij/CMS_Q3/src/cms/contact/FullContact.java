package cms.contact;

public class FullContact extends Contact{

    String addr;

    public FullContact(String name, String email, String group, String addr){
        super(name, email, group);
        this.addr = addr;
    }

    public void showData() {
        System.out.println(getName()+"	"+getEmail()+"	"+getGroup()+"	"+addr);
    }
}
