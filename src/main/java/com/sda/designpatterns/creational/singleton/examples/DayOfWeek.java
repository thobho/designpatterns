package com.sda.designpatterns.creational.singleton.examples;

public enum DayOfWeek {
    MONDAY("to jes zły dzięn"), THUSDAY("troche leepiej");

    private String description;

    DayOfWeek(String description) {
        this.description = description;
    }

    public void descToUpper(){
        this.description = this.description.toUpperCase();
    }

    public String getDescription() {
        return description;
    }

    public static void main(String[] args) {
        DayOfWeek.MONDAY.descToUpper();
        System.out.println(DayOfWeek.MONDAY.getDescription());
    }
}
