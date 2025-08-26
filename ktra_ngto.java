import java.util.Scanner;

public class ktra_ngto {
    static boolean scp (long x) {
        long s = (long) Math.sqrt(x);
        return s * s == x;
    }

    static boolean is_snt (long n) {
        return scp(5 * n * n + 4) || scp(5 * n * n - 4);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            if (is_snt(n)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
