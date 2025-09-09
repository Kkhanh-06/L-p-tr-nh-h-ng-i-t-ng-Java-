package B24DCCC156_TH1;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class solanxuathien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int m = t;
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] array = new int[105];
            LinkedHashSet<Integer> numArray = new LinkedHashSet<>();
            for (int i = 1; i <= n; ++i) {
                int x = sc.nextInt();
                array[i] = x;
                numArray.add(x);
            }
            System.out.println("Test " + (m - t) + ":");
            for (int x: numArray) {
                int dem = 0;
                for (int i = 1; i <= n; ++i) {
                    if (array[i] == x) {
                        ++dem;
                    }
                }
                System.out.println(x + " xuat hien " + dem + " lan");
            }
        }
        sc.close();
    }
}
