import java.util.*;
public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner sc = new Scanner(System.in);
        int i,j;
        System.out.print("N 입력 : ");
        i = sc.nextInt();
        System.out.print("m 입력 : ");
        j = sc.nextInt();
        TimesTable tt = new TimesTable(i, j);

        tt.show();

    }
}
