import java.util.*;

public class chuso4_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int dem4 = 0, dem7 = 0;
        while (n != 0) {
            if (n % 10 == 4) {
                dem4 += 1;
            } else if (n % 10 == 7) {
                dem7 += 1;
            }
            n /= 10;
        }
        if (dem4 + dem7 == 4 || dem4 + dem7 == 7) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        sc.close();
    }
}
