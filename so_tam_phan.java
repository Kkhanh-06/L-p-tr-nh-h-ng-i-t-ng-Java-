import java.util.*;

public class so_tam_phan {
    public static boolean STP (int a) {
        while (a != 0) {
            int d = a % 10;
            if (d != 0 && d != 1 && d != 2) return false;
            a /= 10;
        }
        return true;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            --t;
            int n = sc.nextInt();
            if (STP(n)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
