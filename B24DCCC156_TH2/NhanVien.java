import java.util.Scanner;

public class NhanVien {
    private String maNV, hoTen, gioiTinh, ngaySinh, diaChi, maSoThue, ngayKi;

    public NhanVien (String hoTen, String gioiTinh, String ngaySinh, String diaChi, String maSoThue, String ngayKi) {
        this.maNV = "00001";
        this.setHoTen(hoTen);
        this.gioiTinh = gioiTinh;
        this.setNgaySinh(ngaySinh);
        this.diaChi = diaChi;
        this.maSoThue = maSoThue;
        this.setNgayKi(ngayKi);
    }

    public void setHoTen(String hoTen) {
        hoTen = hoTen.trim();
        if (hoTen.isEmpty()) {
            this.hoTen = "";
            return;
        }

        String[] words = hoTen.toLowerCase().split("\\s+");
        StringBuilder newhoTen = new StringBuilder();

        for (String word: words) {
            if (word.length() > 0) {
                newhoTen.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1)).append(" ");
            }
        }
        this.hoTen = newhoTen.toString().trim();
    }

    public void setNgaySinh(String ngaySinh) {
        String[] parts = ngaySinh.split("/");
        String day = parts[0];
        String month = parts[1];
        String year = parts[2];

        if (day.length() == 1) day = "0" + day;
        if (month.length() == 1) month = "0" + month;

        ngaySinh = day + "/" + month + "/" + year;
        this.ngaySinh = ngaySinh;
    }

    public void setNgayKi(String ngayKi) {
        String[] parts = ngayKi.split("/");
        String day = parts[0];
        String month = parts[1];
        String year = parts[2];

        if (day.length() == 1) day = "0" + day;
        if (month.length() == 1) month = "0" + month;

        ngayKi = day + "/" + month + "/" + year;
        this.ngayKi = ngayKi;
    }

    public void print() {
        System.out.printf("%s %s %s %s %s %s %s", maNV, hoTen, gioiTinh, ngaySinh, diaChi, maSoThue, ngayKi);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String hoTen = sc.nextLine();
        String gioiTinh = sc.nextLine();
        String ngaySinh = sc.nextLine();
        String diaChi = sc.nextLine();
        String maSoThue = sc.nextLine();
        String ngayKi = sc.nextLine();

        NhanVien nv = new NhanVien(hoTen, gioiTinh, ngaySinh, diaChi, maSoThue, ngayKi);
        nv.print();
        sc.close();
    }
}
