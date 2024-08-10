package org.example;

public class GreenLightState implements TrafficLightState{
    @Override
    public void next(TrafficLight light) {
        light.setState(new RedLightState());
        System.out.println("Turn on green red");
    }

    @Override
    public void reportState() {
        System.out.println("Traffic light is green");
    }
}
