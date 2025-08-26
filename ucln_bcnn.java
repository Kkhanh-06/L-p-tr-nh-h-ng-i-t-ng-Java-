import java.util.*;

public class ucln_bcnn {
    static long gcd (long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long a = sc.nextInt();
            long b = sc.nextInt();
            System.out.println((a * b / gcd(a, b)) + " " + gcd(a, b));
        }
    }
}
