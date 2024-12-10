package com.demo.designfactory;

public abstract class  Order {
    private String orderId;

    public Order(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderId() {
        return orderId;
    }

    public abstract void processOrder();
}


    // Todo -1:
    //Create the order class with the following attributes

    //attribute-orderId
    //processOrder //Methodname

    //Todo -2:
    //Subclasses
   //1)OnlineOrder class implements processOrder
    //2)InStoreOrder class implements processOrder

    //Todo-3
    //Create the OrderFactory
    //Create the order object based in the type

    //Todo-4:
    //Create the Main class


