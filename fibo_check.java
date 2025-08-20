import java.util.*;

public class fibo_check {
    static long fibo (int x) {
        if (x <= 2) return x;
        long nex = 1, pre = 1, fin = 0;
        for (int i = 3; i <= x; ++i) {
            fin = nex + pre;
            pre = nex;
            nex = fin;
        }
        return fin;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        long[] arr = new long[100000];
        for (int i = 2; i <= 1e5 - 1; ++i) {
            arr[i] = fibo(i + 1) - fibo(i - 1);
        }
        while (t-- > 0) {
            long n = sc.nextLong();
            for (int i = 1; i <= arr.length; ++i) {
                if (n == arr[i]) {
                    System.out.println("YES");
                    break;
                } else {
                    continue;
                }
            }
            System.out.println("NO");
        }
    }
}
