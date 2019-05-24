package com.sda.designpatterns.structural.adapter2;

import java.util.Map;

public class PrintableMapAdapter implements Printable {
    //pole, którym jest mapa
    private Map<String, String> map;

    //konstruktor

    public PrintableMapAdapter(Map<String, String> map) {
        this.map = map;
    }

    //implementacjia metody print z Printable
    @Override
    public void print() {
        for (Map.Entry<String, String> entry : this.map.entrySet()) {
            System.out.printf("Klucz: %s, Wartość: %s \n", entry.getKey(), entry.getValue());
        }

        //map.forEach((key, value) -> System.out.printf("Klucz: %s, Wartość: %s", key, value));
    }

}
