import java.util.*;

public class so_chinh_phuong {
    static boolean SCP (long x) {
        if (x < 0) return false;
        long a = (long) Math.sqrt(x);
        if (a * a != x) return false;
        return x >= 0;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            --t;
            long n = sc.nextLong();
            if (SCP(n)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
