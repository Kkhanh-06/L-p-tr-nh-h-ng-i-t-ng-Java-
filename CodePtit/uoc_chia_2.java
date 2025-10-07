import java.util.*;

public class uoc_chia_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            if (n <= 0) {
                System.out.println(0);
            } else {
                long ans = 0;
                for (long i = 1; i <= Math.sqrt(n); ++i) {
                    if (n % i == 0) {
                        long uoc1 = i;
                        long uoc2 = n / i;
                        if (uoc1 % 2 == 0) ans += 1;
                        if (uoc2 % 2 == 0) ans += 1;
                    }
                }
                System.out.println(ans);
            }
        }
        sc.close();
    }
}
