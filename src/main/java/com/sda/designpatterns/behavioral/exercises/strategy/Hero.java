package com.sda.designpatterns.behavioral.exercises.strategy;

public class Hero {
    private FightStyle fightStyle;

    public Hero() {
        this.fightStyle = new UnarmedFightStyle();
    }

    public void setFightStyle(FightStyle fightStyle) {
        this.fightStyle = fightStyle;
    }

    public void fight(){
        fightStyle.fight();
    }
}
