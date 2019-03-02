package cms.contact;

public class Contact {
        private String name;
        private String email;
        private String group;

        public Contact(String name, String email, String group) {
            this.name = name;
            this.email = email;
            this.group = group;
        }

        public void showData() {
            System.out.println(name+"	"+email+"	"+group);
        }

        public String getName(){
            return name;
        }
        public String getEmail() {return email;}
        public String getGroup() {return group;}
}

