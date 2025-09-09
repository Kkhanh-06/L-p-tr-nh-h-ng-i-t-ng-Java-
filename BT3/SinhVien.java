package BT3;

import java.util.ArrayList;
import java.util.Scanner;

public class SinhVien {
    private String msv;
    private String hoten;
    private int tuoi;

    private static int numSinhVien = 0;

    public SinhVien(String msv, String hoten, int tuoi) {
        this.msv = msv;
        this.hoten = hoten;
        this.tuoi = tuoi;
        numSinhVien += 1;
    }

    public static void hienSoSinhVien() {
        System.out.println("Hien tai dang co: " + numSinhVien + " sinh vien.");
    }

    public void hienSinhVien() {
        System.out.println("MSV: " + msv + " | Ho va ten: " + hoten + " | Tuoi: " + tuoi);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<SinhVien> ds = new ArrayList<>();
        while (true) {
            String maSinhVien = sc.nextLine();
            if (maSinhVien.equals("0")) {
                break;
            }
            String hoVaTen = sc.nextLine();
            int tuoi = Integer.parseInt(sc.nextLine());
            SinhVien sv = new SinhVien(maSinhVien, hoVaTen, tuoi);
            ds.add(sv);
            hienSoSinhVien();
            for (SinhVien s : ds) {
                s.hienSinhVien();
            }
        }
        sc.close();
    }
}
