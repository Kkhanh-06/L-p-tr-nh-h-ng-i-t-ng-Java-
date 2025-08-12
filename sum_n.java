import java.util.Scanner;

public class sum_n {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        int test = scanf.nextInt();
        for (int i = 1; i <= test; ++i) {
            long n = scanf.nextInt();
            System.out.println(n * (n + 1) / 2);
        }
    }
}
