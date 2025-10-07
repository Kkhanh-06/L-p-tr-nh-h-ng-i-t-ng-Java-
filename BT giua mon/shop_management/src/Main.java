package src;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Thông tin khách hàng
        System.out.print("Vui long nhap ten khach hang: ");
        String nameCustomer = sc.nextLine();
        System.out.println();
        System.out.print("Vui long nhap email: ");
        String email = sc.nextLine();
        System.out.println();
        Customer customer = new Customer(nameCustomer, email);
        Order order = new Order(customer);

        // Thông tin sản phấm bán
        String[] productNames = { "quan to ong dai", "ao thu dong", "mu thoi trang", "vay", "giay nike" };
        double[] productPrices = { 100000, 200000, 50000, 2000000, 500000 };
        List<Product> allProducts = new ArrayList<>();
        for (int i = 0; i < productNames.length; ++i) {
            allProducts.add(new Product(productNames[i], productPrices[i]));
        }
        System.out.println("Vui long chon san pham: ");
        int num = 0;
        for (Product product : allProducts) {
            System.out.println((++num) + ". " + product.getNameProduct() + " - " + product.getPrice() + "VND");
        }

        // Chọn mua hàng
        while (true) {
            System.out.println("Ban co muon mua khong? Co(1) / Khong(0)");
            int check = sc.nextInt();
            if (check == 1) {
                System.out.print("Nhap thu tu san pham: ");
                int chooseProduct = sc.nextInt();
                order.addProduct(allProducts.get(chooseProduct - 1));
            } else {
                System.out.println("Ten khach hang: " + order.getCustomer().getNameCustomer());
                List<Product> products = order.getProducts();
                int i = 0;
                for (Product product : products) {
                    System.out.println("San pham " + (++i) + ": " + product.getNameProduct());
                    System.out.println("Gia tien: " + product.getPrice() + "VND");
                    System.out.println();
                }
                System.out.println("Tong don: " + order.caculateProductPrice() + "VND");
                break;
            }
        }
        sc.close();
    }
}
