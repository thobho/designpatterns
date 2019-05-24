package com.sda.designpatterns.creational.abstractfactory.example.windows;

import com.sda.designpatterns.creational.abstractfactory.example.Checkbox;

public class WindowsChecbox implements Checkbox {
    public void paint() {
        System.out.println("windows checkbox");
    }
}
