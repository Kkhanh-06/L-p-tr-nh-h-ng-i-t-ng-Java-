import java.util.*;

public class cat_doi {
    public static boolean choose (long n) {
        while (n != 0) {
            if (n % 10 != 0 && n % 10 != 1 && n % 10 != 8 && n % 10 != 9) {
                return false;
            }
            n /= 10;
        }
        return true;
    }

    public static long change (long n) {
        if (n == 1) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            if (n <= 0) {
                System.out.println("INVALID");
            } else {
                if (choose(n)) {
                    long s = n;
                    StringBuilder x = new StringBuilder();
                    while (s != 0) {
                        x.append(change(s % 10));
                        s /= 10;
                    }
                    String ans = x.reverse().toString();
                    ans = ans.replaceFirst("^0+","");
                    if (ans.isEmpty()) ans = "INVALID";
                    System.out.println(ans);
                } else {
                    System.out.println("INVALID");
                }
            }
        }
    }
}
