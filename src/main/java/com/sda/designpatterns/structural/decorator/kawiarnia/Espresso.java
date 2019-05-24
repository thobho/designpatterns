package com.sda.designpatterns.structural.decorator.kawiarnia;

public class Espresso extends Napoj {

    public Espresso() {
        super.opis = "Espresso";
    }

    @Override
    double koszt() {
        return 2;
    }
}
