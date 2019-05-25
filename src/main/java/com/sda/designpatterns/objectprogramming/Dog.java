package com.sda.designpatterns.objectprogramming;

public class Dog extends Animal {

    private Hearth hearth;

    public static String latinSpeciesName = "sfa";

    public Dog(String name, Hearth hearth) {
        super(name);
        this.hearth = hearth;
    }


    public Dog(String name) {
        super(name);
        this.hearth = new Hearth();
    }



    public void bark(){
        System.out.println("Bark!!");
    }

}
