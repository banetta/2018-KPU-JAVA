import java.util.*;
public class Main {

    public static void main(String[] args) {
	// write your code here

        int n,m;

        Scanner sc = new Scanner(System.in);

        System.out.print("몇단? : ");
        n = sc.nextInt();

        System.out.print("어디까지? : ");
        m = sc.nextInt();

        int[][] table = new int [n][m];

        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                //System.out.printf("%d * %d = %d\n",i , j , i * j);
                table [i][j] = (i+1) * (j+1);
                System.out.printf("%d * %d = %d\n", (i+1), (j+1), table[i][j]);
            }
        }
        //  foreach문 사용해보기


    }
}
