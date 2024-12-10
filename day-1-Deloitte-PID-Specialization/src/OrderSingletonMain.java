public class OrderSingletonMain {
    public static void main(String[] args) {
        //Accessin the singleton instances

        OrderSingleton orderInstance=OrderSingleton.getInstance();

        //performing the operation
        orderInstance.placeOrder("12345");
        orderInstance.cancelOrder("12345");

    }

}
