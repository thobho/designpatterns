package com.sda.designpatterns.creational.factorymethod;

public class Circle implements Shape, Color{
    @Override
    public String draw() {
        return "This is CIRCLE!!!";
    }

    @Override
    public void colorMe() {

    }
}