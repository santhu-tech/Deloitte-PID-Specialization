public class ElectronicsProduct extends Product {
    private int warrantyPeriod;


    public ElectronicsProduct(int productId, String productName, double price, int warrantyPeriod) {
        super(productId, productName, price);
        this.warrantyPeriod = warrantyPeriod;
    }


    public int getWarrantyPeriod() {
        return warrantyPeriod;
    }

    public void setWarrantyPeriod(int warrantyPeriod) {
        this.warrantyPeriod = warrantyPeriod;
    }

    @Override
    public String getProductDetails() {
        return "Electronics Product: " + getProductName() + ", Warranty: " + warrantyPeriod + " months";
    }
}
