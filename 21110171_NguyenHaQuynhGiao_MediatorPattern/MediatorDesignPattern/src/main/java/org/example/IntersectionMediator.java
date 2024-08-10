package org.example;

import java.util.HashMap;
import java.util.Map;

public class IntersectionMediator implements TrafficMediator{

    private Map<String, TrafficLight> lights = new HashMap<>();

    @Override
    public void registerLight(TrafficLight light, String direction) {
        lights.put(direction, light);
    }

    @Override
    public void receiveSignal(String signal, String direction) {
        TrafficLight light = lights.get(direction);
        if (light != null) {
            light.changeLight(signal);
        }
    }
}
