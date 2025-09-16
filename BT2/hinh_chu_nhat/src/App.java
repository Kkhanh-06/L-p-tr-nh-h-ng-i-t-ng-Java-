import java.util.Scanner;
import hinh_chu_nhat.HinhChuNhat;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        long width = sc.nextLong();
        long height = sc.nextLong();
        HinhChuNhat hcn = new HinhChuNhat(width, height);

        System.out.println("Chieu rong: " + hcn.getWidth());
        System.out.println("Chieu dai: " + hcn.getHeight());
        System.out.println("Chu vi: " + hcn.getPerimeter());
        System.out.println("Dien tich: " + hcn.getArea());
        sc.close();
    }
}
