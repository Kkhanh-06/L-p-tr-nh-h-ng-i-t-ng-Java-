import java.util.Scanner;
import java.util.TreeSet;

public class giao_2_day {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[1005];
        int[] b = new int[1005];
        for (int i = 1; i <= n; ++i) {
            int x = sc.nextInt();
            a[i] = x;
        }
        for (int i = 1; i <= m; ++i) {
            int y = sc.nextInt();
            b[i] = y;
        }
        TreeSet<Integer> arr = new TreeSet<>();
        for (int i = 1; i <= n; ++i) {
            for (int j = 1; j <= m; ++j) {
                if (a[i] == b[j]) {
                    arr.add(a[i]);
                }
            }
        }
        for (int i: arr) {
            System.out.print(i + " ");
        }
        sc.close();
    }
}
