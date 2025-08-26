import java.util.Scanner;

public class hinh_chu_nhat {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        int a = scanf.nextInt();
        int b = scanf.nextInt();
        int ChuVi = (a + b) * 2;
        int DienTich = a * b;
        if (a <= 0 || b <= 0) {
            System.out.println(0);
        } else {
            System.out.println(ChuVi + " " + DienTich);
        }
    }
}
