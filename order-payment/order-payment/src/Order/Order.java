package Order;
import java.util.List;

import Payment.PaymentMethod;
import Product.Product;

public class Order {
    private String nameCustomer;
    private List<Product> products;
    private PaymentMethod paymentMethod;

    public Order (String nameCustomer, List<Product> products, PaymentMethod paymentMethod) {
        this.nameCustomer = nameCustomer;
        this.products = products;
        this.paymentMethod = paymentMethod;
    }

    public double caculatorTotal() {
        double total = 0;
        for (Product p: products) {
            total += p.priceProduct;
        }
        return total;
    }

    public void checkOut() {
        double total = caculatorTotal();
        System.out.println("Khach hang: " + nameCustomer);
        System.out.println("Tong tien: " + total);
        paymentMethod.pay(total);
    }
}
