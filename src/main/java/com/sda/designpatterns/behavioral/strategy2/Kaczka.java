package com.sda.designpatterns.behavioral.strategy2;

import java.util.Scanner;

public class Kaczka {
    private Latanie latanie;

    public Kaczka() {
        this.latanie = new NormalneLatanie();
    }

    public void setLatanie(Latanie latanie) {
        this.latanie = latanie;
    }

    void lec() {
        latanie.lec();
    }


    public static void main(String[] args) {

        Kaczka kaczka = new Kaczka();

        System.out.println("Jak kaczka ma latać??\n 1 - lata\n 2- nie lata");
        Scanner scanner = new Scanner(System.in);
        int strategy = scanner.nextInt();

        switch (strategy) {
            case 1:
                kaczka.setLatanie(new NormalneLatanie());
                break;
            case 2:
                kaczka.setLatanie(new Nielot());
                break;
        }

        kaczka.lec();

    }
}
