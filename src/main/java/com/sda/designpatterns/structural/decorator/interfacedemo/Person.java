package com.sda.designpatterns.structural.decorator.interfacedemo;

public class Person implements Singable{
    private String name;

    @Override
    public void sing() {
        System.out.println("La la al");
    }
}
