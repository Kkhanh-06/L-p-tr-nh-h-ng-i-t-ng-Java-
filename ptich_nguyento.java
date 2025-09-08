import java.util.*;

public class ptich_nguyento {
    static boolean SNT(long x) {
        if (x <= 1)
            return false;
        for (long i = 2; i <= Math.sqrt(x); ++i) {
            if (x % i == 0)
                return false;
        }
        return true;    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int x = t;
        while (t-- > 0) {
            long n = sc.nextLong();
            System.out.print("Test " + (x - t) + ": ");
            if (SNT(n) || n == 1 || n == 0) {
                System.out.print(n + "(1)");
            } else {
                for (long i = 1; i * i <= n; ++i) {
                    if (n % i == 0 && SNT(i)) {
                        long uoc1 = i;
                        long uoc2 = n / i;
                        int dem = 0;
                        while (n % uoc1 == 0) {
                            n /= uoc1;
                            ++dem;
                        }
                        System.out.print(uoc1 + "(" + dem + ")" + " ");
                        if (SNT(uoc2) && uoc2 != uoc1) {
                            long dem1 = 0;
                            while (n % uoc2 == 0) {
                                n /= uoc2;
                                ++dem1;
                            }
                            System.out.print(uoc2 + "(" + dem1 + ")" + " ");
                        }
                        
                    }
                }
            }
            System.out.println("");
        }
        sc.close();
    }
}
