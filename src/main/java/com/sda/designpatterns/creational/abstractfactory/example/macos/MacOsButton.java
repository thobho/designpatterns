package com.sda.designpatterns.creational.abstractfactory.example.macos;

import com.sda.designpatterns.creational.abstractfactory.example.Button;

public class MacOsButton implements Button {
    public void paint() {
        System.out.println("Mac OS button created");
    }
}
