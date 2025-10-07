package src;
public class Product {
    private String nameProduct;
    private double price;

    public Product (String nameProduct, double price) {
        this.setNameProduct(nameProduct);
        this.setPrice(price);
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public double getPrice() {
        return price;
    }

    public void setNameProduct(String nameProduct) {
        nameProduct = nameProduct.trim();
        if (nameProduct.isEmpty()) {
            this.nameProduct = "";
            return;
        }

        // Chuyển xâu kí tự về mảng kí tự với mỗi phần tử là 1 từ viết thường
        String[] words = nameProduct.trim().toLowerCase().split("\\s+");
        StringBuilder newNameProduct = new StringBuilder();

        // Viết hoa chữ cái đầu của từ đầu tiên, các từ sau giữ nguyên
        newNameProduct.append(Character.toUpperCase(words[0].charAt(0)))
                      .append(words[0].substring(1));

        for (int i = 1; i < words.length; ++i) {
            newNameProduct.append(" ").append(words[i]);
        }
        this.nameProduct = newNameProduct.toString().trim();
    }

    public void setPrice(double price) {
        // Thông báo khi nhập sai giá
        if (price < 0) {
            throw new IllegalArgumentException("Giá nhập vào không thể là số âm!");
        }
        this.price = price;
    }
}
