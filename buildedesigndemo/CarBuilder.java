package com.buildedesigndemo;

public class CarBuilder {
     String engine;
     int wheels;
     String color;
    String modelNumber;

    int carNumber;

    public CarBuilder(String engine, String color) {
        this.engine = engine;
        this.color = color;
    }

    public CarBuilder setWheels(int wheels) {
        this.wheels = wheels;
        return this;
    }

    public CarBuilder setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
        return this;
    }

    public CarBuilder setCarNumber(int carNumber) {
        this.carNumber = carNumber;
        return this;
    }
    public Car build(){
        return new Car(this);
    }
}
