package com.day3.collection;

public class Product {

    String id;
    String name;
    double price;

    //Todo1:
            //--> Add the Exception here

            //-->Write a method called updateprice
    public Product(String id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }



    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
