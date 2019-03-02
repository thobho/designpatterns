package com.sda.designpatterns.structural.decorator3;

public abstract class Napoj {

    protected String opis = "Napój nieznany";

    public String pobierzOpis() {
        return opis;
    }

    abstract double koszt();

}
