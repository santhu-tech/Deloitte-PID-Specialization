package com.day4.multithreading;

public class ThreadLifeCycle extends Thread{
    public void run(){
        try{
            System.out.println(Thread.currentThread().getName()+ "is running");
            Thread.sleep(500); //Timed waiting state
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }

    }

    public static void main(String[] args) throws InterruptedException {
        ThreadLifeCycle threadLifeCycle=new ThreadLifeCycle();

        //new state -->before start my thread and after creating the thread
        System.out.println("New State:" +threadLifeCycle.getState());

        //Start my thread
        threadLifeCycle.start();

        //Runnable state
        System.out.println("Runnable State:"  +threadLifeCycle.getState());

        Thread.sleep(100);  //Wait for this 100ms to thread to execute
        System.out.println("EXecution :" + threadLifeCycle.getState());

        threadLifeCycle.join(); //wait for the termination
        System.out.println("Termination :" +threadLifeCycle.getState());
    }

}
