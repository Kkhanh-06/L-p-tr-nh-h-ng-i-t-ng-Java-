import java.util.Scanner;

public class caculator {
    private long x;
    private long y;
    public caculator(long x, long y) {
        this.x = x;
        this.y = y;
    }

    public long peremeter() {
        return 2 * (x + y);
    }

    public long area() {
        return x * y;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long y = sc.nextLong();
        if (x <= 0 || y <= 0) {
            System.out.println("Nhap x, y khong hop le!");
        } else {
            caculator cltor = new caculator(x, y);
            System.out.println("Chu vi: " + cltor.peremeter());
            System.out.println("Dien tich: " + cltor.area());
        }
        sc.close();
    }
}