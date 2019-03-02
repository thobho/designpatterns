package com.sda.designpatterns.structural.decorator3;

public class Mleko extends SkladnikiDekorator {

    Napoj napoj;

    public Mleko(Napoj napoj) {
        this.napoj = napoj;
    }

    @Override
    public String pobierzOpis() {
        return napoj.pobierzOpis() + " z mlekiem";
    }

    @Override
    double koszt() {
        return napoj.koszt() + 0.50;
    }
}
