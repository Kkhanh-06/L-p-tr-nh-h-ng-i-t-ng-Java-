import java.util.Scanner;

public class mangdoixung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[106];
            for (int i = 1; i <= n; ++i) {
                int x = sc.nextInt();
                a[i] = x;
            }
            if (n <= 1) {
                System.out.println("YES");
            }
            boolean check = true;
            for (int i = 1; i <= n / 2; ++i) {
                if (a[i] != a[n - i + 1]) {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            } 
        }
        sc.close();
    }
}
