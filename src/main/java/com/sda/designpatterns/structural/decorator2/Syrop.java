package com.sda.designpatterns.structural.decorator2;

public class Syrop extends NapojDecorator {

    Napoj napoj;

    public Syrop(Napoj napoj) {
        this.napoj = napoj;
    }

    @Override
    public String getOpis() {
        return napoj.getOpis() + "syrop";
    }

    @Override
    public double getKoszt() {
        return napoj.getKoszt() + 1;
    }
}
