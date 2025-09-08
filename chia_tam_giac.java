import java.util.Scanner;

public class chia_tam_giac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int h = sc.nextInt();
            for (int i = 1; i <= n - 1; ++i) {
                System.out.print(String.format("%.6f", h * Math.sqrt((double) i / n)) + " ");
            }
            System.out.println("");
        }
        sc.close();
    }
}
