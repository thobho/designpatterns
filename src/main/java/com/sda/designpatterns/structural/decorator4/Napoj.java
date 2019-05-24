package com.sda.designpatterns.structural.decorator4;

public abstract class Napoj {

    private String opis;

    public String getOpis() {
        return opis;
    }

    protected abstract double koszt();
}
