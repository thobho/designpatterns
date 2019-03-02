package com.sda.designpatterns.behavioral.exercises.strategy;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Hero hero = new Hero();
        Scanner scanner = new Scanner(System.in);
        hero.fight();
        while (true){
            System.out.println("1 - Sword \n 2 - Bow");
            int fightSwitch = scanner.nextInt();
            switch (fightSwitch) {
                case 1:
                    hero.setFightStyle(new SwordFightStyle());
                    break;
                case 2:
                    hero.setFightStyle(new BowFigthStyle());
                    break;
            }
            hero.fight();
        }
    }
}
