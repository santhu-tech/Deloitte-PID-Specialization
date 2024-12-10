package com.demo.designfactory;

public class InstoreOrder extends Order {
    public InstoreOrder(String orderId){

        super(orderId);
    }

    public void processOrder(){
        System.out.println("It's storeorder");
    }
}
