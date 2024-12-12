package com.day4.multithreading;


//Create a thread from the Thread class

public class MultiDemo extends Thread {

    public void run(){
        System.out.println("Thread is running");
    }

    public static void main(String[] args) {
        MultiDemo t=new MultiDemo();
        t.start();
    }

}
