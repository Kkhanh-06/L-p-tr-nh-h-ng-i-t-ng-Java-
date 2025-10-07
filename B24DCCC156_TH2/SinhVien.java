import java.util.Scanner;

public class SinhVien {
    private String maSV, hoTen, lop, ngaySinh;
    private float gpa;

    public SinhVien (String hoTen, String lop, String ngaySinh, float gpa) {
        this.maSV = "B20DCCN001";
        this.setHoTen(hoTen);
        this.lop = lop;
        this.setNgaySinh(ngaySinh);
        this.gpa = gpa;
    }

    public String getMaSV() {
        return maSV;
    }

    public String getHoTen() {
        return hoTen;
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

    public String getLop() {
        return lop;
    }

    public String getNgaySinh() {
        return ngaySinh;
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

    public float getGPA() {
        return gpa;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String hoTen = sc.nextLine();
        String lop = sc.nextLine();
        String ngaySinh = sc.nextLine();
        float gpa = sc.nextFloat();

        SinhVien sv = new SinhVien(hoTen, lop, ngaySinh, gpa);
        System.out.printf("%s %s %s %s %.2f", sv.getMaSV(), sv.getHoTen(), sv.getLop(), sv.getNgaySinh(), sv.getGPA());
        sc.close();
    }
}
