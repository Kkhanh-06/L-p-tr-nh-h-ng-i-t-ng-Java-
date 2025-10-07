import java.util.*;

public class fibonacci {
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
        
        while (t-- > 0) {
            int n = sc.nextInt();
            System.out.println(fibo(n + 1) - fibo(n - 1));
        }
        sc.close();
    }
}
