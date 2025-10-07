import java.util.*;

public class tong_uoc1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        long tong = 0;
        while (t-- > 0) {
            long n = sc.nextLong();
            int N = (int) n;
            boolean[] prime = new boolean[N + 1];
            Arrays.fill(prime, true);
            prime[0] = prime[1] = false;
            for (int i = 2; i * i <= N; ++i) {
                if (prime[i]) {
                    for (int j = i * i; j <= N; j += i) {
                        prime[j] = false;
                    }
                }
            }
            long tmp = n;
            for (int i = 2; i <= N; ++i) {
                if (prime[i]) {
                    while (tmp % i == 0) {
                        tong += i;
                        tmp /= i;
                    }
                }
            }
        }
        System.out.println(tong);
        sc.close();
    }
}