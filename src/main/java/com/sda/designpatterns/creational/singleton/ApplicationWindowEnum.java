package com.sda.designpatterns.creational.singleton;

public enum ApplicationWindowEnum {
    INSTANCE(100, 100, "Welcome"); // deafult values

    private int width;
    private int height;
    private String welcomeText;

    ApplicationWindowEnum(int width, int height, String welcomeText) {
        this.width = width;
        this.height = height;
        this.welcomeText = welcomeText;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getWelcomeText() {
        return welcomeText;
    }

    public void setWelcomeText(String welcomeText) {
        this.welcomeText = welcomeText;
    }
}
