// Cho độ dài hai cạnh của hình chữ nhật. Giá trị không quá 104.  
// Viết chương trình tính chu vi và diện tích của hình chữ nhật đó. Nếu dữ liệu không hợp lệ (chiều dài hoặc chiều rộng ≤ 0 thì in ra số 0) 

// Input
// Có duy nhất một dòng ghi hai số nguyên, cách nhau một khoảng trống.

// Output
// In kết quả trên một dòng, chu vi rồi đến diện tích, cách nhau một khoảng trống.

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
