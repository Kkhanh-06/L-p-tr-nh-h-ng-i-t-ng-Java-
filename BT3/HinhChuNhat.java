package BT3;
public class HinhChuNhat {
    private int chieurong;
    private int chieudai;

    public HinhChuNhat(int x, int y) {
        this.chieurong = x;
        this.chieudai = y;
    }

    public int chuvi() {
        return 2 * (chieurong + chieudai);
    }

    public int dientich() {
        return chieurong * chieudai;
    }

    public static void main(String[] args) {
        HinhChuNhat hcn = new HinhChuNhat(2, 3);
        System.err.println("Hinh chu nhat co: ");
        System.out.println("    Chieu dai: " + hcn.chieudai);
        System.out.println("    Chieu rong: " + hcn.chieurong);
        System.out.println("    Chu vi: " + hcn.chuvi()); 
        System.out.println("    Dien tich: " + hcn.dientich());
    }
}
