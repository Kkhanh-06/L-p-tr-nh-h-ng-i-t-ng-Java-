package BT3;

import java.util.Scanner;

public class TaiKhoan {
    private String stk;
    private String chuSTK;
    private long du;

    private static final double laiSuat = 0.03;

    public TaiKhoan(String stk, String chuSTK, long du) {
        this.stk = stk;
        this.chuSTK = chuSTK;
        this.du = du;
    }

    public void hienThongTin() {
        System.out.println("Khach hang: " + chuSTK + " | STK: " + stk + " | So du: " + du);
    }

    public void napTien(long n) {
        du += n;
        System.out.println("Da nap " + n + ". So du moi: " + du);
    }

    public void rutTien(long n) {
        if (n <= du) {
            du -= n;
            System.out.println("Da rut " + n + ". So du moi: " + du);
        } else {
            System.out.println("Tai khoan quy khach khong du de rut.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String stk = sc.nextLine();
        String chuSTK = sc.nextLine();
        long du = sc.nextLong();
        sc.nextLine();
        TaiKhoan tk = new TaiKhoan(stk, chuSTK, du);
        tk.hienThongTin();

        System.out.println("Ban muon nap (N) hay rut tien (R)?");
        String check = sc.nextLine();
        check = check.toUpperCase();
        if (check.equals("N")) {
            System.out.print("Nhap so tien nap: ");
            long tienNap = Long.parseLong(sc.nextLine());
            tk.napTien(tienNap);
        } else if (check.equals("R")) {
            System.out.print("Nhap so tien rut: ");
            long tienRut = Long.parseLong(sc.nextLine());
            tk.rutTien(tienRut);
        }
        sc.close();
    }
}
