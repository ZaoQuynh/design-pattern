package org.example;

public interface TrafficLightState {
    public void next(TrafficLight light);
    public void reportState();
}
