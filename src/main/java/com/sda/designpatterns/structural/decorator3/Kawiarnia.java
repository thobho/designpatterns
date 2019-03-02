package com.sda.designpatterns.structural.decorator3;

public class Kawiarnia {
    public static void main(String[] args) {
        Espresso espresso = new Espresso();
        Mleko mleko = new Mleko(espresso);
        Mleko mleko2 = new Mleko(mleko);
        Cukier cukier = new Cukier(mleko2);
        System.out.println(cukier.pobierzOpis());
        System.out.println(cukier.koszt());
    }
}
