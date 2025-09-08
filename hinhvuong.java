import java.util.Scanner;

public class hinhvuong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Đọc tọa độ hình chữ nhật thứ nhất
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        // Đọc tọa độ hình chữ nhật thứ hai
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();
        int x4 = sc.nextInt();
        int y4 = sc.nextInt();

        // Tìm phạm vi bao phủ
        int minX = Math.min(x1, x3);
        int maxX = Math.max(x2, x4);
        int minY = Math.min(y1, y3);
        int maxY = Math.max(y2, y4);

        // Tính cạnh hình vuông
        int side = Math.max(maxX - minX, maxY - minY);

        // In ra diện tích
        System.out.println(side * side);
        sc.close();
    }
}
