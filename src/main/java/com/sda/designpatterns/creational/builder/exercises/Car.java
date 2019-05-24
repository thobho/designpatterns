package com.sda.designpatterns.creational.builder.exercises;

public class Car {

    private double engineVolume;
    private String color;
    private boolean isSportCar;

    public Car(double engineVolume, String color, boolean isSportCar) {
        this.engineVolume = engineVolume;
        this.color = color;
        this.isSportCar = isSportCar;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isSportCar() {
        return isSportCar;
    }

    public void setSportCar(boolean sportCar) {
        isSportCar = sportCar;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engineVolume=" + engineVolume +
                ", color='" + color + '\'' +
                ", isSportCar=" + isSportCar +
                '}';
    }
}
