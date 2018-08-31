package com.sda.designpatterns.creational.abstractfactory;

public class MacOsButton implements Button{
    public void paint() {
        System.out.println("Mac OS button created");
    }
}
