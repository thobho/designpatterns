package com.sda.designpatterns.structural.decorator4;

import java.io.FileInputStream;
import java.io.InputStream;

public class Cukier extends SkladnikiDekorator {

    Napoj napoj;

    public Cukier(Napoj napoj) {
        this.napoj = napoj;
    }

    @Override
    public String getOpis() {
        return null;
    }

    @Override
    protected double koszt() {
        return this.napoj.koszt() + 0.20;
    }

}
