package com.sda.designpatterns.structural.composite.example;

import java.util.List;

public class General implements Soldier {

    private List<Soldier> soldiers;

    public General(List<Soldier> soldiers) {
        this.soldiers = soldiers;
    }

    @Override
    public void meld() {
        System.out.println("Jestem Generałem");
    }
}
