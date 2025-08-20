import java.util.*;

public class tong_giai_thua {
    static long GT (int n) {
        long ans = 1;
        for (int i = 1; i <= n; ++i) {
            ans *= i;
        } 
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long gthua = 0;
        for (int i = 1; i <= n; ++i) {
            gthua += GT(i);
        }
        System.out.println(gthua);
    }
}
