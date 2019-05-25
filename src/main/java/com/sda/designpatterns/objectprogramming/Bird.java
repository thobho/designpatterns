package com.sda.designpatterns.objectprogramming;

public class Bird extends Animal implements Singable {
    public Bird(String name) {
        super(name);
    }

    @Override
    public void sing() {
        System.out.println("cwir cwir");
    }
}
