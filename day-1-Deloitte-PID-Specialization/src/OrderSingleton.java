public class OrderSingleton {
    //Singleton instances
    private static volatile OrderSingleton instance;

    //Logger Instance
    private static final OrderLogger logger = OrderLogger.getLogger();

    //private Constrcutor
    private OrderSingleton() {
        logger.logInfo("Order instance is created");
    }

    //public method to provide the global access
    public static OrderSingleton getInstance() {
        if (instance == null) {
            synchronized (OrderSingleton.class) {
                if (instance == null) {
                    logger.logInfo("Creating the singleton Instances for the order");
                    instance = new OrderSingleton();
                }
            }
        }

        return instance;
    }
    //Example Method
    public void placeOrder(String orderId){
        logger.logInfo("Placing the order with id:" +orderId);
    }

    public void cancelOrder(String orderId){
        logger.logInfo("Cancelled order with Id:" +orderId);
    }

}

