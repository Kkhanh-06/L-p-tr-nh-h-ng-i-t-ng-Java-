import java.util.*;

public class tong_uoc1 {
    static boolean SNT(int x) {
        if (x <= 1)
            return false;
        for (long i = 2; i <= Math.sqrt(x); ++i) {
            if (x % i == 0)
                return false;
        }
        return true;    
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int x = t;
        int tong = 0;
        while (t-- > 0) {
            int n = sc.nextInt();
            if (SNT(n) || n == 1 || n == 0) {
                tong += n;
            } else {
                for (int i = 1; i * i <= n; ++i) {
                    if (n % i == 0 && SNT(i)) {
                        int uoc1 = i;
                        int uoc2 = n / i;
                        int dem = 0;
                        while (n % uoc1 == 0) {
                            n /= uoc1;
                            ++dem;
                        }
                        tong += uoc1 * dem;
                        if (SNT(uoc2)) {
                            int dem1 = 0;
                            while (n % uoc2 == 0) {
                                n /= uoc2;
                                ++dem1;
                            }
                            tong += uoc2 * dem1;
                        }
                        
                    }
                }
            }
        }
        System.out.println(tong);
    }
}
