package com.sda.designpatterns.structural.decorator.car;

public class DecoratorPatternTest {

    public static void main(String[] args) {


        Car basicCar = new BasicCar();

        Car luxuryCar = new LuxuryCar(basicCar);

        Car sportLuxuryCar = new SportsCar(luxuryCar);


        sportLuxuryCar.assemble();
    }

}
