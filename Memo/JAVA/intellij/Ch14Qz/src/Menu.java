import java.util.Scanner;

public class Menu {
    public int issueMenu(){
        Scanner sc = new Scanner(System.in);
        System.out.println(" -----------<MENU>----------- ");
        System.out.printf("|   %d. %-18s   |\n", 1, "MyFlowLayout");
        System.out.printf("|   %d. %-18s   |\n", 2, "BorderLayout");
        System.out.printf("|   %d. %-18s   |\n", 3, "BoxLayout");
        System.out.printf("|   %d. %-18s   |\n", 4, "GridLayout");
        System.out.printf("|   %d. %-18s   |\n", 5, "CardLayout");
        System.out.printf("|   %d. %-18s   |\n", 6, "AbsoluteLayout");
        System.out.println("|                           |");
        System.out.printf("|   %d. %-18s   |\n", 0, "Exit");
        System.out.println(" ---------------------------- ");
        System.out.print(">> ");
        return sc.nextInt();
    }
}
