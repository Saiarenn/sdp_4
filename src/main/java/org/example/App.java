package org.example;

public class App {
    private Factory factory;

    public App(Factory factory) {
        this.factory = factory;
    }

    public void setFactory(Factory factory) {
        this.factory = factory;
    }

    public void run() {
        Train train = factory.createTrain();
        train.create();
    }

}
