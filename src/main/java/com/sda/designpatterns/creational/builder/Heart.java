package com.sda.designpatterns.creational.builder;

public class Heart {
    private double mass;

    public Heart(Heart heart){
        this.mass = heart.getMass();
    }

    public double getMass() {
        return mass;
    }

    public Heart(double mass) {
        this.mass = mass;
    }
}
