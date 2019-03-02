package com.sda.designpatterns.structural.decorator3;

public class Cukier extends SkladnikiDekorator {
    Napoj napoj;

    public Cukier(Napoj napoj) {
        this.napoj = napoj;
    }

    @Override
    public String pobierzOpis() {
        return napoj.pobierzOpis() + " z cukrem";
    }

    @Override
    double koszt() {
        return napoj.koszt() + 0.2;
    }
}
