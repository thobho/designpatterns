package com.sda.designpatterns.structural.composite.example;

import java.util.List;

public class Major implements Soldier {

    private List<Soldier> soldiers;

    public Major(List<Soldier> soldiers) {
        this.soldiers = soldiers;
    }

    @Override
    public void meld() {
        System.out.println("Jestem majorem");
    }
}
