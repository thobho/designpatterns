package com.sda.designpatterns.structural.decorator.interfacedemo;

import java.util.ArrayList;
import java.util.List;

public class Orchiestra {

    List<Singable> singers;

    public Orchiestra(List<Singable> singers) {
        this.singers = singers;
    }

    public static void main(String[] args) {
        Bird bird = new Bird();
        Person person = new Person();

        List<Singable> singers = new ArrayList<>();
        singers.add(bird);
        singers.add(person);

    }
}
