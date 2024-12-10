package com.demo.designfactory;

public class Main {
    public static void main(String[] args) {

        //creating the online order

        Order onlineOrder=OrderFactory.createOrder("Online","ord001");
        onlineOrder.processOrder();

        //creating the offline order
        Order offlineOrder=OrderFactory.createOrder("instore","ord001");
        offlineOrder.processOrder();
    }
}
