package com.sda.designpatterns.creational.abstractfactory;

public class MacOsFactory extends GUIFactory {
    public Button createButton() {
        return new MacOsButton();
    }

    public Checkbox createCheckbox() {
        return new MacOsCheckbox();
    }
}
