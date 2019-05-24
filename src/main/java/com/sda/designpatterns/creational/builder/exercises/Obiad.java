package com.sda.designpatterns.creational.builder.exercises;

public class Obiad {

    private int kalorie;
    private String pierszeDanie;
    private String drugieDanie;
    private boolean czyJestDeser;

    public Obiad(int kalorie, String pierszeDanie, String drugieDanie, boolean czyJestDeser) {
        this.kalorie = kalorie;
        this.pierszeDanie = pierszeDanie;
        this.drugieDanie = drugieDanie;
        this.czyJestDeser = czyJestDeser;
    }

    public int getKalorie() {
        return kalorie;
    }

    public void setKalorie(int kalorie) {
        this.kalorie = kalorie;
    }

    public String getPierszeDanie() {
        return pierszeDanie;
    }

    public void setPierszeDanie(String pierszeDanie) {
        this.pierszeDanie = pierszeDanie;
    }

    public String getDrugieDanie() {
        return drugieDanie;
    }

    public void setDrugieDanie(String drugieDanie) {
        this.drugieDanie = drugieDanie;
    }

    public boolean isCzyJestDeser() {
        return czyJestDeser;
    }

    public void setCzyJestDeser(boolean czyJestDeser) {
        this.czyJestDeser = czyJestDeser;
    }
}
