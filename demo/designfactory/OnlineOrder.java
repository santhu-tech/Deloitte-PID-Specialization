package com.demo.designfactory;

public class OnlineOrder extends Order{
    public OnlineOrder(String orderId){

        super(orderId);
    }

    public void processOrder(){
        System.out.println("It's Online order");
    }
}
