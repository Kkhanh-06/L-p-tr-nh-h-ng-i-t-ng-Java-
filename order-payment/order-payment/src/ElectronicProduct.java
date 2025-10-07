public class ElectronicProduct extends Product {
    private String infoIMEI;
    private int warrantyPeriod;

    public ElectronicProduct (String productID, String nameProduct, double priceProduct, String infoIMEI, int warrantyPeriod) {
        super(productID, nameProduct, priceProduct, "Electronic");
        this.infoIMEI = infoIMEI;
        this.warrantyPeriod = warrantyPeriod;
    }

    public String getInfoIMEI() {
        return infoIMEI;
    }

    public int getWarrantyPeriod() {
        return warrantyPeriod;
    }
}
