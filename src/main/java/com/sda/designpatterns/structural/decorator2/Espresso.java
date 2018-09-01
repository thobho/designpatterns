package com.sda.designpatterns.structural.decorator2;

public class Espresso extends Napoj {

    public Espresso() {
        super();
        this.opis = "Espresso";
    }

    @Override
    public double getKoszt() {
        return 1.99;
    }
}
