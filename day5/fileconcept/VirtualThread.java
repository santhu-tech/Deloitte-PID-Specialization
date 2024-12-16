package com.day5.fileconcept;

import java.util.concurrent.Executor;

public class VirtualThread{  //Handling high volume of data
    //Java 21 and above
    //Virtual Thread -->No Limitation Managed by JVM
        //LightWeight Thread
        //Concurrency
        //Efficient
    //Thread.ofVirtual() -->Factory Method
    //Executors -->utility class
    //Thread.Builder.OfVirtual
    //Executor
    //Real life :

    //Database ==>ETL

    //Thread --> backed as a OS Thread

    public static void main(String[] args) {
        //Create and start the Virtual Thread
        Thread virtualThread=Thread.ofVirtual().start(()->{
            System.out.println("Hello Welcome to the virtual thread");
        });
        try{
            virtualThread.join();

        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }

}
