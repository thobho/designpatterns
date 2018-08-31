package com.sda.designpatterns.creational.abstractfactory;

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
