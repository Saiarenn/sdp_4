package org.example;

public class SteamFactory implements Factory{
    @Override
    public Train createTrain() {
        return new SteamTrain();
    }
}
