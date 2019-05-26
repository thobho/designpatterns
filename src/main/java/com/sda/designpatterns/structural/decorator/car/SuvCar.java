package com.sda.designpatterns.structural.decorator.car;

public class SuvCar extends CarDecorator{
    public SuvCar(Car c) {
        super(c);
    }

    @Override
    public void assemble(){
        super.assemble();
        System.out.print(" Adding features of SUV Car.");
    }
}
