package com.sda.designpatterns.structural.adapter3;

import java.util.Random;

public class WheaterStation {
    public double getCelciusTemperature(){
        return new Random().nextDouble();
    }
}
