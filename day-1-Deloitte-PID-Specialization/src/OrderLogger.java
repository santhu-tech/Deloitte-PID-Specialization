import java.util.logging.Level;
import java.util.logging.Logger;

public class OrderLogger {
    //Singleton logger instances
    private static final Logger logger= Logger.getLogger(OrderSingleton.class.getName());

    //private constrcutor
    private OrderLogger(){

    }

    //Methods

    public static OrderLogger getLogger(){
        return new OrderLogger();
    }

    //info-level msgs

    public void logInfo(String message){
        logger.log(Level.INFO, message);
    }

    //error msg

    public void logError(String message,Throwable throwable){
        logger.log(Level.SEVERE,message,throwable);
    }

}

