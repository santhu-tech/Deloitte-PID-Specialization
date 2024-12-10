public class ClothingProduct extends Product {
    private String size;
    private String color;


    public ClothingProduct(int productId, String productName, double price, String size, String color) {
        super(productId, productName, price);
        this.size = size;
        this.color = color;
    }


    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String getProductDetails() {
        return "Clothing Product: " + getProductName() + ", Size: " + size + ", Color: " + color;
    }
}
