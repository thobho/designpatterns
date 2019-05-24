package com.sda.designpatterns.creational.abstractfactory.example.macos;

import com.sda.designpatterns.creational.abstractfactory.example.Button;
import com.sda.designpatterns.creational.abstractfactory.example.Checkbox;
import com.sda.designpatterns.creational.abstractfactory.example.GUIFactory;

public class MacOsFactory extends GUIFactory {
    public Button createButton() {
        return new MacOsButton();
    }

    public Checkbox createCheckbox() {
        return new MacOsCheckbox();
    }
}
