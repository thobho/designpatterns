package com.sda.designpatterns.creational.abstractfactory.example.windows;

import com.sda.designpatterns.creational.abstractfactory.example.Button;
import com.sda.designpatterns.creational.abstractfactory.example.Checkbox;
import com.sda.designpatterns.creational.abstractfactory.example.GUIFactory;

public class WindowsOsFactory extends GUIFactory {
    public Button createButton() {
        return new WindowsButton();
    }

    public Checkbox createCheckbox() {
        return new WindowsChecbox();
    }
}
