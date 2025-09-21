import java.util.Scanner;

public class ThiSinh {
    private String hoTen, ngaySinh;
    private double diem1, diem2, diem3;

    public ThiSinh (String hoTen, String ngaySinh, double diem1, double diem2, double diem3) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
    }

    public String getHoTen () {
        return hoTen;
    }

    public String getNgaySinh () {
        return ngaySinh;
    }

    public String tongDiem () {
        double tong = diem1 + diem2 + diem3;
        String tongDiem = String.format("%.1f", tong);
        return tongDiem;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String hoTen = sc.nextLine();
        String ngaySinh = sc.nextLine();
        double diem1 = sc.nextDouble();
        double diem2 = sc.nextDouble();
        double diem3 = sc.nextDouble();
        ThiSinh thiSinh = new ThiSinh(hoTen, ngaySinh, diem1, diem2, diem3);
        System.out.print(thiSinh.getHoTen() + " " + thiSinh.getNgaySinh() + " " + thiSinh.tongDiem());
        sc.close();
    }
}
