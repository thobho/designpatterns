package com.sda.designpatterns.creational.abstractfactory;

public class WindowsOsFactory extends GUIFactory {
    public Button createButton() {
        return new WindowsButton();
    }

    public Checkbox createCheckbox() {
        return new WindowsChecbox();
    }
}
