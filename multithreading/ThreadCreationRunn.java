package com.day4.multithreading;

public class ThreadCreationRunn implements Runnable{
    @Override
    public void run() {
        System.out.println("Runnable is running ");

    }

    public static void main(String[] args) {
        ThreadCreationRunn threadCreationRunn=new ThreadCreationRunn();
        Thread t=new Thread(threadCreationRunn);
        t.start();

    }
}

