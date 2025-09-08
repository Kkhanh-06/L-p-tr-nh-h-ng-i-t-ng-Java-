import java.util.Scanner;

public class ptrinh_1 {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        double a = scanf.nextDouble();
        double b = scanf.nextDouble();
        if (a == 0 && b != 0) {
            System.out.println("VN");
        } else if (a == 0 && b == 0) {
            System.out.println("VSN");
        } else {
            String ans = String.format("%.2f", -b / a);
            System.out.println(ans);
        }
        scanf.close();
    }
}
