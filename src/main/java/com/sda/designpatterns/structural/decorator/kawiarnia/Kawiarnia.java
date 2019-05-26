package com.sda.designpatterns.structural.decorator.kawiarnia;

public class Kawiarnia {
    public static void main(String[] args) {
        Napoj espresso = new Espresso();
        Napoj espressoZCukrem = new Cukier(espresso);


        System.out.println(espressoZCukrem.pobierzOpis());
        System.out.println(espressoZCukrem.koszt());
//        Napoj espressoZMlekiem = new Mleko(espresso);
//        Napoj espressZ2Mlekiem = new Mleko(espressoZMlekiem);
//        Napoj espressoZ2MlekiemICukrem = new Cukier(espressZ2Mlekiem);
//        System.out.println(espressoZ2MlekiemICukrem.pobierzOpis());
//        System.out.println(espressoZ2MlekiemICukrem.koszt());
    }
}
