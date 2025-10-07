import java.util.*;

import Order.Order;
import Payment.PaymentMethod;
import Payment.VisaPayment;
import Product.ElectronicProduct;
import Product.FoodProduct;
import Product.Product;

public class Main {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();

        // Tạo sản phẩm
        Product p1 = new ElectronicProduct("E001", "Tai nghe Bluetooth", 350000, "IMEI123456", 12);
        Product p2 = new FoodProduct("F001", "Bánh quy", 50000, "10/10/2025");
        Product p3 = new ElectronicProduct("E002", "Chuột không dây", 250000, "IMEI789012", 6);

        productList.add(p1);
        productList.add(p2);
        productList.add(p3);

        // Chọn phương thức thanh toán
        PaymentMethod payment = new VisaPayment(); // Có thể thay bằng CreditCardPayment hoặc MomoPayment

        // Tạo đơn hàng
        Order order = new Order("Nguyễn Văn A", productList, payment);

        // Thanh toán
        order.checkOut();
    }
}
