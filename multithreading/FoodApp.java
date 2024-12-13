package com.day4.multithreading;

public class FoodApp {
    public static void main(String[] args) {
        //Thread 1: Order Preperation

        Thread orderPereperation =new Thread(() ->{
            try{
                System.out.println("Food is prepared...");
                Thread.sleep(3000); //Prepare food
                System.out.println("Prepared food...");
              //  Thread.sleep(2000);
            }
            catch(InterruptedException e){
                System.out.println("Order cancelled");
            }
        });
        orderPereperation.setPriority(Thread.MAX_PRIORITY);

        //Thread 2: Delivery Assignment
        Thread deliveryAssignment =new Thread(() ->{
            try{
                Thread.sleep(4000);
                System.out.println("Waiting for food to prepared...");
             //  Thread.sleep(3000); //Prepare food
                orderPereperation.join();
                System.out.println("Delivery Person assigned...");
            }

            catch(InterruptedException e){
                System.out.println("Order cancelled");
            }
        });

        deliveryAssignment.setPriority(Thread.NORM_PRIORITY);

        //Main thread :Tracking
        Thread tracking=new Thread(()->{
            try{
                deliveryAssignment.join();
                System.out.println("Tracking the delivery ");
            }
            catch(InterruptedException e){
                System.out.println("Order cancelled");
            }
        });


        //start threads
        orderPereperation.start();
        deliveryAssignment.start();
        tracking.start();
        try{
            tracking.join();   //Main Thread should wait for tracking to finish

        }catch(Exception e){
            System.out.println("Order interrupted");
        }

        System.out.println("Food delivered successfully ");

    }
}
