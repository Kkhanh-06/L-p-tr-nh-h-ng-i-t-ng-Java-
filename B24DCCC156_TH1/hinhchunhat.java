package B24DCCC156_TH1;

import java.util.Scanner;

public class hinhchunhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        if (x <= 0 || y <= 0) {
            System.out.println(0);
        } else {
            System.out.print((2 * (x + y)) + " " + (x * y));
        }
        sc.close();
    }
}
