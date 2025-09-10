import java.util.*;

public class ptich_nguyento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int m = t;
        while (t-- > 0) {
            int n = sc.nextInt();
            Map<Integer, Integer> dem = new LinkedHashMap<>();
            for (int i = 2; i <= n; ++i) {
                int num = 0;
                while (n % i == 0) {
                    dem.put(i, ++num);
                    n /= i;
                }
            }
            
            System.out.print("Test " + (m - t) + ": ");
            for (Map.Entry<Integer, Integer> num: dem.entrySet()) {
                System.out.print(num.getKey() + "(" + num.getValue() + ")" + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
