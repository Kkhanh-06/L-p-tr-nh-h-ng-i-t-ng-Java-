public class FoodProduct extends Product {
    private String expiryDate;

    public FoodProduct (String productID, String nameProduct, double priceProduct, String expiryDate) {
        super(productID, nameProduct, priceProduct, "Food");
        this.setExpiryDate(expiryDate);
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        String[] parts = expiryDate.split("/");
        String day = parts[0];
        String month = parts[1];
        String year = parts[2];

        if (day.length() == 1) day = "0" + day;
        if (month.length() == 1) month = "0" + month;

        expiryDate = day + "/" + month + "/" + year;
        this.expiryDate = expiryDate;
    }
}
