package com.sda.designpatterns.structural.decorator3;

public class Espresso extends Napoj {

    public Espresso() {
        super.opis = "Espresso";
    }

    @Override
    double koszt() {
        return 2;
    }
}
