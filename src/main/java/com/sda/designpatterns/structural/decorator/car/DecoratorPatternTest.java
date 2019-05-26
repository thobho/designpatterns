package com.sda.designpatterns.structural.decorator.car;

public class DecoratorPatternTest {

    public static void main(String[] args) {


        Car basicCar = new BasicCar();

        Car sportLuxuryCar = new SportsCar(basicCar);
        Car luxuryCar = new LuxuryCar(sportLuxuryCar);

        SuvCar suvCar = new SuvCar(luxuryCar);

        suvCar.assemble();
    }

}
