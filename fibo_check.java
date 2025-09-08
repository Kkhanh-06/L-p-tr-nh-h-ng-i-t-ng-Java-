import java.util.Scanner;
import java.math.BigInteger;

public class fibo_check {
    static boolean scp(BigInteger x) {
        BigInteger s = sqrt(x);
        return s.multiply(s).equals(x);
    }

    // Hàm căn bậc hai cho BigInteger
    static BigInteger sqrt(BigInteger x) {
        BigInteger left = BigInteger.ZERO, right = x;
        while (left.compareTo(right) <= 0) {
            BigInteger mid = left.add(right).shiftRight(1);
            BigInteger midSq = mid.multiply(mid);
            int cmp = midSq.compareTo(x);
            if (cmp == 0) return mid;
            else if (cmp < 0) left = mid.add(BigInteger.ONE);
            else right = mid.subtract(BigInteger.ONE);
        }
        return right;
    }

    static boolean isFibo(BigInteger n) {
        BigInteger five = BigInteger.valueOf(5);
        BigInteger four = BigInteger.valueOf(4);
        BigInteger n2 = n.multiply(n);
        return scp(five.multiply(n2).add(four)) || scp(five.multiply(n2).subtract(four));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            BigInteger n = sc.nextBigInteger();
            if (isFibo(n)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
