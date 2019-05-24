package com.sda.designpatterns.creational.abstractfactory.example;

import com.sda.designpatterns.creational.abstractfactory.example.macos.MacOsFactory;
import com.sda.designpatterns.creational.abstractfactory.example.windows.WindowsOsFactory;

public class GuiMain {

    public static void main(String[] args) {
        Application application = new Application(new WindowsOsFactory());
        Application applicationMac = new Application(new MacOsFactory());
    }

    private static Application configureApplication() {
        Application app;
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            factory = new MacOsFactory();
            app = new Application(factory);
        } else {
            factory = new WindowsOsFactory();
            app = new Application(factory);
        }
        return app;
    }

}
