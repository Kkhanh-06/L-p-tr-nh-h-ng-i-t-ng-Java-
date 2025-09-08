import java.util.*;

public class so_lien_ke {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long a[] = new long[20];
            long n = sc.nextLong();
            int dem = 0;
            while (n != 0) {
                ++dem;
                long s = n % 10;
                a[dem] = s;
                n /= 10;
            }
            boolean check = true;
            for (int i = 2; i <= dem; ++i) {
                if (Math.abs(a[i] - a[i - 1]) != 1) {
                    check = false;
                    break;
                }
            }
            if (check == true) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
