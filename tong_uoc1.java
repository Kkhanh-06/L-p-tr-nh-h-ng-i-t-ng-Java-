import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class tong_uoc1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int sum = 0;
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
            for (Map.Entry<Integer, Integer> num: dem.entrySet()) {
                sum += num.getKey() * num.getValue();
            }
        }
        System.out.println(sum);
        sc.close();
    }
}
