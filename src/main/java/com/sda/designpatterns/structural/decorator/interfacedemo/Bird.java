package com.sda.designpatterns.structural.decorator.interfacedemo;

public class Bird implements Singable {
    @Override
    public void sing() {
        System.out.println("Ćwird");
    }
}
