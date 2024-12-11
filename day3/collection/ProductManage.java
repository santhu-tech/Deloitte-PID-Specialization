package com.day3.collection;

import java.util.HashMap;
import java.util.Map;

public class ProductManage {

    public static void main(String[] args) {
        Map<String,Product> catlog=new HashMap<>();
        catlog.put("P001",new Product("P001_00","Laptop",15000.0));
        catlog.put("P002",new Product("P002_00","Book",150.0));
        catlog.put("P003",new Product("P003_00","Cloths",1500.0));
        catlog.put("P004",new Product("P004_00","Groceries",2500.0));

        //Add the condition to check the product is not null

        Product product =catlog.get("P001");
        System.out.println(product);

        //Update the price of the product

        //display all the product

        //remove a product by id

        //displayall product after removal

        //Write a addproduct method to add the product to catalog
    }


    //Product product =c

}
