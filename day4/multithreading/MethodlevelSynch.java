package com.day4.multithreading;

public class MethodlevelSynch {
    private int count =0;
    //mehtod level synch  --->object level
//    public synchronized  void increment(){
//
//        count++;
//    }

    //Block level synchronization
    public void increment() {

        synchronized (this) {
            count++;
        }
    }

    //static Synchronization  --->Class level
    //    public static synchronized  void increment(){
//
//        count++;
//    }


    public int getCount(){
        return count ;
    }

    public static void main(String[] args) throws InterruptedException {
        MethodlevelSynch methodlevelSynch=new MethodlevelSynch();

        Thread t1=new Thread(()->{
            for(int i=0;i<1000;i++){
                methodlevelSynch.increment();
               System.out.println(Thread.currentThread().getName() + "incremented count" +methodlevelSynch.getCount());

            }
        });

        Thread t2=new Thread(()->{
            for(int i=0;i<1000;i++){
                methodlevelSynch.increment();
                System.out.println(Thread.currentThread().getName() + "incremented count" +methodlevelSynch.getCount());

            }
        });

        //Starting the thread
        t1.start();
        t2.start();

        //waiting for both the threads to finish
         t1.join();
         t2.join();

        System.out.println(methodlevelSynch.getCount());  //2000 (or) 1000
    }
}
