package com.buildedesigndemo;

public class Car {
    private String engine;
    private int wheels;
    private String color;
    private String modelNumber;

    private int carNumber;

    public Car(CarBuilder builder) {
        this.engine = builder.engine;
        this.wheels = builder.wheels;
        this.color = builder.color;
        this.modelNumber = builder.modelNumber;
        this.carNumber = builder.carNumber;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine='" + engine + '\'' +
                ", wheels=" + wheels +
                ", color='" + color + '\'' +
                ", modelNumber='" + modelNumber + '\'' +
                ", carNumber=" + carNumber +
                '}';
    }
}
