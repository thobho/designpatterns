package com.sda.designpatterns.structural.decorator;

public class DecoratorPatternTest {

    public static void main(String[] args) {


        Car basicCar = new BasicCar();
       // basicCar.assemble();

        Car luxuryCar = new LuxuryCar(basicCar);

        Car sportsCar = new SportsCar(luxuryCar);


        sportsCar.assemble();


        //sportsCar.assemble();
//        System.out.println("\n*****");
//
//        Car sportsLuxuryCar = new SportsCar(new LuxuryCar(new BasicCar()));
//        sportsLuxuryCar.assemble();
    }

}
