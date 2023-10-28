package org.example;

public class ElectricFactory implements Factory{
    @Override
    public Train createTrain() {
        return new ElectricTrain();
    }
}
