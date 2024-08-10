package org.example;

public class RedLightState implements TrafficLightState{

    @Override
    public void next(TrafficLight light) {
        light.setState(new YellowLightState());
        System.out.println("Turn on yellow light");
    }

    @Override
    public void reportState() {
        System.out.println("Traffic light is red");
    }
}
