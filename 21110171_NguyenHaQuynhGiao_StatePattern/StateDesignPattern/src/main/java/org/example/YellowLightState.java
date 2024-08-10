package org.example;

public class YellowLightState implements TrafficLightState{
    @Override
    public void next(TrafficLight light) {
        light.setState(new GreenLightState());
        System.out.println("Turn on green light");
    }

    @Override
    public void reportState() {
        System.out.println("Traffic light is yellow");
    }
}
