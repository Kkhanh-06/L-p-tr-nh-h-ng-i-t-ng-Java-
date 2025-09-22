import java.util.List;
import java.util.ArrayList;

public class Order {
    private Customer customer;
    private List<Product> products;
    private int orderID;
    private static int orderCount = 0;

    public Order(Customer customer) {
        this.customer = customer;
        this.products = new ArrayList<>();
        orderCount += 1;
        this.orderID = orderCount;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public double caculateProductPrice() {
        double total = 0;
        for (Product product: products) {
            total += product.getPrice();
        }
        return total;
    }

    public Customer getCustomer() {
        return customer;
    }

    public List<Product> getProducts() {
        return products;
    }

    public int getOrderID() {
        return orderID;
    }

    public static int getOrderCount() {
        return orderCount;
    }
}
