package com.sda.designpatterns.behavioral.strategy.exercises;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Witaj w grze. Wybierz strategię walki");
        System.out.println("1 - Sword; 2- Łuk");

        Hero hero = new Hero("Aragorn");

        while (true){
            int fightStrategyChoice = scanner.nextInt();

            switch (fightStrategyChoice){
                case 1:
                    hero.setFightStrategy(new SwordFightStrategy());
                    break;
                case 2:
                    hero.setFightStrategy(new BowFightStrategy());
                    break;
                case 3:
                    hero.setFightStrategy(new DefaultFightStrategy());
                    break;
                default:
                    System.out.println("Broń nie zmieniona");
            }
            //WYKORZYSTENIE STRATEGII!!!
            hero.getFightStrategy().fight();
        }
    }
}
