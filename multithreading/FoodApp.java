package com.day4.multithreading;

public class FoodApp {
    public static void main(String[] args) {
        //Thread 1: Order Preperation

        Thread orderPereperation =new Thread(() ->{
            try{
                System.out.println("Food is prepared...");
                Thread.sleep(3000); //Prepare food
                System.out.println("Prepared food...");
            }
            catch(InterruptedException e){
                System.out.println("Order cancelled");
            }
        });
        orderPereperation.setPriority(Thread.MAX_PRIORITY);

        //Thread 2: Delivery Assignment
        Thread deliveryAssignment =new Thread(() ->{
            try{
                System.out.println("Food is prepared...");
               // Thread.sleep(3000); //Prepare food
                orderPereperation.join();
                System.out.println("Prepared food...");
            }
            catch(InterruptedException e){
                System.out.println("Order cancelled");
            }
        });

        deliveryAssignment.setPriority(Thread.NORM_PRIORITY);

        //Main thread :Tracking



        //start threads

        //Main Thread should wait for tracking to finish

    }
}
