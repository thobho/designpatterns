package com.sda.designpatterns.behavioral.strategy.exercises;

public class DefaultFightStrategy implements FightStrategy {
    @Override
    public void fight() {
        System.out.println("Walzcę gołymi pięściami!! BAM BAM!!!");
    }
}
