import java.util.Scanner;
import java.util.TreeSet;

public class hop_2_day {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        TreeSet<Integer> arr = new TreeSet<>();
        for (int i = 1; i <= n; ++i) {
            int x = sc.nextInt();
            arr.add(x);
        }
        for (int i = 1; i <= m; ++i) {
            int y = sc.nextInt();
            arr.add(y);
        }
        for (int i: arr) {
            System.out.print(i + " ");
        }
        sc.close();
    }
}
