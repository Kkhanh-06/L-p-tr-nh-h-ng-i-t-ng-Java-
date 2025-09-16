public class tong_phan_so {
    private long x1;
    private long y1;
    private long x2;
    private long y2;

    public tong_phan_so(long x1, long y1, long x2, long y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    static long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public void sum_ps () {
        long tuso = x1 * y2 + x2 * y1;
        long mauso = y1 * y2;
        System.out.println();
    }
}
