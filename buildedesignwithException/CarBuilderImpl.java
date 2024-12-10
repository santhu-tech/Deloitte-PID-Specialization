package com.buildedesigndemo;

import com.buildedesigndemo.Exception.CarBuilderException;

public class CarBuilderImpl {
    public static void main(String[] args) {
        try {
            Car car = new CarBuilder("Eng001", "Red")
                    .setCarNumber(2458)
                    .setWheels(2)
                    .setModelNumber("2000")
                    .build();
            System.out.println(car);

            Car car1 = new CarBuilder("Eng002", "Blue")
                    .setModelNumber("2020")
                    .build();
            System.out.println(car1);

            Car ca1 = new CarBuilder("Eng003", "WineRed")
                    .build();
            System.out.println(ca1);

        }
        catch(CarBuilderException e){
            System.out.println(e.getMessage());
        }
}
}
