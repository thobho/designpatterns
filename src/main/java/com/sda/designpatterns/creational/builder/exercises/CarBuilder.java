package com.sda.designpatterns.creational.builder.exercises;

public class CarBuilder {

    //mandatory
    private double engineVolume;


    //obligatory
    private String color;
    private boolean isSportCar;

    public CarBuilder(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public CarBuilder setSportCar(boolean isSportCar) {
        this.isSportCar = isSportCar;
        return this;
    }

    public CarBuilder setColor(String colorOdProgramisty){
        this.color = colorOdProgramisty;
        return this;
    }

    public Car createCar(){
        return new Car(engineVolume, color, isSportCar);
    }

    public static void main(String[] args) {
        Car red = new CarBuilder(1223)
                .setSportCar(false)
                .createCar();

        System.out.println(red);
    }
}
