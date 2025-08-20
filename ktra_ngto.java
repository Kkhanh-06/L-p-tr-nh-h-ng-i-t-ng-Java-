import java.util.Scanner;

public class ktra_ngto {
    public static boolean SNT (int x) {
        if (x <= 1) return false;
        for (int i = 2; i <= Math.sqrt(x); ++i) {
            if (x % i == 0) return false;
        }
        return x > 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            --t;
            int n = sc.nextInt();
            if (SNT(n)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
