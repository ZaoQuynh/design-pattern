package org.example;

public class TrafficControlTest {
    public static void main(String[] args) {
        TrafficLight light = new TrafficLight();
        do {
            light.reportState();
            light.change();
        } while (!light.getState().getClass().equals(RedLightState.class));
    }
}