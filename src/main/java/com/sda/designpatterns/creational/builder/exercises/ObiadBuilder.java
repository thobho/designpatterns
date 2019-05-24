package com.sda.designpatterns.creational.builder.exercises;

public class ObiadBuilder {

    private int kalorie;
    private String pierszeDanie;
    private String drugieDanie;
    private boolean czyJestDeser;

    public ObiadBuilder(int kalorie) {
        this.kalorie = kalorie;
    }

    public ObiadBuilder setPierszeDanie(String pierszeDanie) {
        this.pierszeDanie = pierszeDanie;
        return this;
    }

    public ObiadBuilder setDrugieDanie(String drugieDanie) {
        this.drugieDanie = drugieDanie;
        return this;
    }

    public ObiadBuilder setCzyJestDeser(boolean czyJestDeser) {
        this.czyJestDeser = czyJestDeser;
        return this;
    }

    public Obiad createObiad(){
        return new Obiad(kalorie, pierszeDanie, drugieDanie, czyJestDeser);
    }
}
