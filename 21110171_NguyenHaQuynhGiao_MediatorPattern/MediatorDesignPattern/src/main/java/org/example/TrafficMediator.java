package org.example;

public interface TrafficMediator {

    public void registerLight(TrafficLight trafficLight, String direction);
    public void receiveSignal(String signal, String direction);
}
