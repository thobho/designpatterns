package com.sda.designpatterns.structural.decorator2;

public abstract class Napoj {

    protected String opis = "opis nieznany";

    public String getOpis() {
        return opis;
    }

    public abstract double getKoszt();
}
