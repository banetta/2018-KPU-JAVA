public class Manager extends Employee {
    private int bonus;

    public void printSalary(){
        System.out.println(name+"("+address+"):"+(salary+bonus));
    }

    public void printRRN(){
        System.out.println(RRN);
    }
}
