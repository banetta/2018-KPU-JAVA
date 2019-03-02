public class Main {

   static boolean isPrimeNumber(int num) {

        for (int k = 2; k < num; k++) {
            if (num % k == 0) return false;
        }
        return true;
   }
    public static void Main(String[] args) {
        // write your code here

        int a, b;

        for (a = 1; a <= 10; a++) {
            for (b = 1; b <= 10; b++) {
                if (a * b == 1)
                    System.out.printf(" %3d", a * b);
                else if (isPrimeNumber(a * b))
                    System.out.printf("(%3d)", a * b);
            }
        }

        }
    }
}
