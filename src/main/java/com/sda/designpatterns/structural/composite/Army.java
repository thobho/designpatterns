package com.sda.designpatterns.structural.composite;

import java.util.Arrays;

public class Army {
    private General general;

    public Army(General general) {
        this.general = general;
    }

    public static void main(String[] args) {
        Capitan capitan1 = new Capitan();
        Capitan capitan2 = new Capitan();
        Major major = new Major(Arrays.asList(capitan1, capitan2));
        General general = new General(Arrays.asList(major));
        
    }
}
