package com.sda.designpatterns.structural.decorator4;

public class KawiarniaMain {

    public static void main(String[] args) {
        Napoj espresso = new Espresso();

        Napoj espressoZCukrem = new Cukier(espresso);

        System.out.println(espressoZCukrem.koszt());
    }
}
