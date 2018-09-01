package com.sda.designpatterns.structural.decorator2;

public class Kawiarnia {
    public static void main(String[] args) {
        Napoj kawaZCzekolad = new Syrop(new Czekolada(new Espresso()));
        Napoj kawa = new Espresso();
        System.out.println(kawa.getKoszt());
        System.out.println(kawaZCzekolad.getKoszt());
        System.out.println(kawaZCzekolad.getOpis());
    }
}
