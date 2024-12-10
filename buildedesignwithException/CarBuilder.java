package com.buildedesigndemo;

import com.buildedesigndemo.Exception.CarBuilderException;

public class CarBuilder {
     String engine;
     int wheels;
     String color;
    String modelNumber;

    int carNumber;

    public CarBuilder(String engine, String color) {

        if(engine==null || engine.isEmpty()){
            try {
                throw new CarBuilderException("Engine is the mendaratory field ");
            } catch (CarBuilderException e) {
                throw new RuntimeException(e);
            }
        }
        if(color==null){
            try {
                throw new CarBuilderException("Error");
            } catch (CarBuilderException e) {
                throw new RuntimeException(e);
            }
        }
        this.engine = engine;
        this.color = color;
    }

    public CarBuilder setWheels(int wheels) throws CarBuilderException {
        if(wheels<4)
        {
            throw new CarBuilderException("It shouldn't be less than 4");
        }
        this.wheels = wheels;
        return this;
    }

    public CarBuilder setModelNumber(String modelNumber) throws CarBuilderException {
        this.modelNumber = modelNumber;
        return this;
    }

    public CarBuilder setCarNumber(int carNumber) {
        this.carNumber = carNumber;
        return this;
    }
    public Car build() throws CarBuilderException{
        if(engine==null || color==null){
            throw new CarBuilderException("Must have the above field ");
        }
        return new Car(this);
    }
}
