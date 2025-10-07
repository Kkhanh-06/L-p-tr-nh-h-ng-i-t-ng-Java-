import java.util.Scanner;

public class bcnn_n_dau {
    static long gcd (long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    static long lcd (long a, long b) {
        return a * b / gcd(a, b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            long bcnn = 1;
            for (int i = 1; i <= n; ++i) {
                bcnn = lcd(i, bcnn);
            } 
            System.out.println(bcnn);
        }
        sc.close();
    }
}
