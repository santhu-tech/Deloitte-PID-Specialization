package com.demo.designfactory;

public class OrderFactory {
    public static Order createOrder(String orderType,String orderId){
        if("online".equalsIgnoreCase(orderType)){
            return new OnlineOrder(orderId);
        } else if ("instore".equalsIgnoreCase(orderType)) {
            return new InstoreOrder(orderId);
        }
        else {
            throw new IllegalArgumentException("Invalid order Type " +orderType);
        }
    }
}
