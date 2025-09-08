import java.util.*;

public class uocnguyenmax {
    static boolean SNT (long x) {
        if (x <= 1) return false;
        for (int i = 2; i <= Math.sqrt(x); ++i) {
            if (x % i == 0) return false;
        }
        return x > 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            if (SNT(n)) {
                System.out.println(n);
            } else {
                long uocMax = 0;
                for (long i = 1; i * i <= n; ++i) {
                    if (n % i == 0) {
                        long uoc1 = i;
                        long uoc2 = n / i;
                        if (uoc1 > uocMax && uoc1 < n && SNT(uoc1)) uocMax = uoc1;
                        if (uoc2 > uocMax && uoc2 < n && SNT(uoc2)) uocMax = uoc2;
                    }
                }
                System.out.println(uocMax);
            }
        }
        sc.close();
    }
}
