package B24DCCC156_TH1;

import java.util.Scanner;

public class tong_n_dau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            System.out.println(n * (n + 1) / 2);
        }
        sc.close();
    }
}
