package B24DCCC156_TH1;

import java.util.Scanner;

public class dem_to_hop {
    static int n, k, count = 0;
    static int[] a = new int[15];

    static void toHop(int i, int start) {
        for (int j = start; j <= n; j++) {
            a[i] = j;
            if (i == k) {
                for (int t = 1; t <= k; t++) {
                    System.out.print(a[t] + " ");
                }
                System.out.println();
                count++;
            } else {
                toHop(i + 1, j + 1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        toHop(1, 1);
        System.out.println("Tong cong co " + count + " to hop");
        sc.close();
    }
}
