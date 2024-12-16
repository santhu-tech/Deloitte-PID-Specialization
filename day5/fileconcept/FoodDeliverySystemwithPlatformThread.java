package com.day5.fileconcept;

import java.util.concurrent.Executors;

public class FoodDeliverySystemwithPlatformThread {
    //Order Validation (Ex:Check the restaurant Availability in the Database )
    //Payment Processing (Ex:Interact with Payment GateWay)
    //Order Confirmation(Ex:Sending a Confirmation email )
    public static void main(String[] args) {
        var executor= Executors.newFixedThreadPool(10);//Limited to 10 Threads

        for( int i=0;i<=50;i++){
            int orderId=i;
            executor.submit(()->processOrder(orderId));
        }
        executor.shutdown();
    }
    private static void processOrder(int orderId){
        System.out.println("Processing order" +orderId +Thread.currentThread());

        simulateBlockingOperation("Validating order " +orderId);
        simulateBlockingOperation("processing Payment for order " +orderId);
        simulateBlockingOperation("Confirmation Order" +orderId);
        System.out.println("Order " +orderId + "completed");

    }

    private static void simulateBlockingOperation(String task){
        System.out.println(task + Thread.currentThread());
        try
        {
            Thread.sleep(2000); //Simulate a 2 seco delay
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
