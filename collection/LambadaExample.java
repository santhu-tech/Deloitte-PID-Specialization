package com.day3.collection;

public class LambadaExample {
    public static void main(String[] args) {
//        MyFunctionalInterface lambadaExample= () -> System.out.println("Welcome");
//        lambadaExample.execute();

        MyFunctionalInterface add=(a,b)->a+b;
        MyFunctionalInterface sub=(a,b) ->a-b;

    }
}
