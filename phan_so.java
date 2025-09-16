import java.util.Scanner;

public class phan_so {
    private long tuso;
    private long mauso;

    public phan_so(long tuso, long mauso) {
        this.tuso = tuso;
        this.mauso = mauso;
    }

    public void inPhanSo() {
        long a = gcd(tuso, mauso);
        System.out.println((tuso / a) + "/" + (mauso / a));
    }

    static long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        phan_so ps = new phan_so(a, b);
        ps.inPhanSo();
        sc.close();
    }
}
