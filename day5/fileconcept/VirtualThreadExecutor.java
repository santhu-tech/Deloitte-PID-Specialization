package com.day5.fileconcept;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class VirtualThreadExecutor {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executor = Executors.newVirtualThreadPerTaskExecutor();

        //Tasks to the executor
        for(int i=0;i<10;i++){
            int taskId=i;
            executor.submit(()-> {
                System.out.println("Task" +taskId);
            });
        }
        Thread.sleep(1000);
        executor.shutdown();
     //Optional part
      if(!executor.awaitTermination(60, TimeUnit.SECONDS)){
          executor.shutdownNow();
      }
    }

}
