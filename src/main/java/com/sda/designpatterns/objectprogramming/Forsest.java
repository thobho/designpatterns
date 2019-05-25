package com.sda.designpatterns.objectprogramming;

import java.util.List;

public class Forsest {

    private List<Singable> orchestra;

    public static void main(String[] args) {
        Singable bird1 = new Bird("Słowik");
        Singable bird2 = new Bird("Wróbe");
        System.out.println(Dog.latinSpeciesName);
    }

    public void sing(){
        for (Singable singable:orchestra) {
            singable.sing();
        }
    }
}
