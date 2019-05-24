package com.sda.designpatterns.structural.decorator4;

public class Espresso extends Napoj  {

    public Espresso() {
    }

    @Override
    protected double koszt() {
        return 4;
    }
}
