import java.util.Scanner;

public class hinhvuong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int a1 = sc.nextInt();
        int b1 = sc.nextInt();
        int a2 = sc.nextInt();
        int b2 = sc.nextInt();
        int ans;
        if (Math.abs(y2 - b1) >= Math.abs(a2 - x1)) {
            ans = Math.abs(y2 - b1);
            System.out.println(ans * ans);
        } else {
            ans = Math.abs(a2 - x1);
            System.out.println(ans * ans);
        }
    }
}
