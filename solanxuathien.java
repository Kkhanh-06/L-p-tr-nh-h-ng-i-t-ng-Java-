import java.util.LinkedHashSet;
import java.util.Scanner;

public class solanxuathien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int m = t;
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[10005];
            LinkedHashSet<Integer> arr = new LinkedHashSet<>();
            for (int i = 1; i <= n; ++i) {
                int x = sc.nextInt();
                a[i] = x;
                arr.add(x);
            }
            System.out.println("Test" + " " + (m - t) + ":");
            for (int x : arr) {
                int dem = 0;
                for (int i = 1; i <= n; ++i) {
                    if (a[i] == x) ++dem;
                }
                System.out.println(x + " xuat hien " + dem + " lan");
            }
        }
        sc.close();
    }
}
