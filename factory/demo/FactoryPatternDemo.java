package com.factory.demo;

public class FactoryPatternDemo {
    public static void main(String[] args) {


        //Create the factory
        ShapeFactory shapeFactory=new ShapeFactory();

        //Get an object of Circle
        Shape shape1=shapeFactory.getShape("CIRCLE");
        shape1.draw();


        //Get an object of Rectangle
        Shape shape2=shapeFactory.getShape("RECTANGLE");
        shape2.draw();
    }

}
