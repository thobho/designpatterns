package com.sda.designpatterns.structural.decorator2;


public class Czekolada extends NapojDecorator {

    Napoj napoj;

    public Czekolada(Napoj napoj) {
        this.napoj = napoj;
    }

    @Override
    public String getOpis() {
        return napoj.getOpis() + "czekolada";
    }

    @Override
    public double getKoszt() {
        return napoj.getKoszt() + 0.2;
    }
}
