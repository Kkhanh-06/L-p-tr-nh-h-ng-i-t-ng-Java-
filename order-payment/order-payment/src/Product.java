public class Product {
    protected String productID, nameProduct;
    protected double priceProduct;
    protected String type;

    public Product (String productID, String nameProduct, double priceProduct, String type) {
        this.productID = productID;
        this.nameProduct = nameProduct;
        this.priceProduct = priceProduct;
        this.type = type;
    }

    public String getProductID() {
        return productID;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public double getPriceProduct() {
        return priceProduct;
    }

    public String getType() {
        return type;
    }
}
