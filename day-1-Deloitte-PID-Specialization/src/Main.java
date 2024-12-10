import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Customer customer = new Customer(1, "John", "john@example.com");

     //   Customer c1=new Customer(2,"santhiya","santhiua@gmail.com");
        ElectronicsProduct laptop = new ElectronicsProduct(101, "Laptop", 1200.50, 24);
        ClothingProduct tShirt = new ClothingProduct(201, "T-Shirt", 19.99, "L", "Red");


        Order order = new Order(1001, new Date(), customer);
        order.addProduct(laptop);
        order.addProduct(tShirt);


        System.out.println("Order ID: " + order.getOrderId());
        System.out.println("Customer: " + order.getCustomer().getCustomerName());
        System.out.println("Total Price: Rs." + order.calculateTotalPrice());


        for (Product product : order.getProducts()) {
            System.out.println(product.getProductDetails());
        }
    }
}
