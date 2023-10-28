package org.example;

public class Main {
    public static void main(String[] args) {
        App app = new App(new ElectricFactory());
        app.run();

        app.setFactory(new SteamFactory());
        app.run();
    }
}