package com.sda.designpatterns.creational.abstractfactory.example.macos;

import com.sda.designpatterns.creational.abstractfactory.example.Checkbox;

public class MacOsCheckbox implements Checkbox {

    public void paint() {
        System.out.println("Mac checxbox");
    }
}
