package com.sda.designpatterns.structural.decorator.kawiarnia;

public abstract class Napoj {

    protected String opis = "Napój nieznany";

    public String pobierzOpis() {
        return opis;
    }

    abstract double koszt();

}
