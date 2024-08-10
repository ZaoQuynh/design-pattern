package org.example;

public class TrafficLight {
    private TrafficLightState state;

    public void setState(TrafficLightState state) {
        this.state = state;
    }

    public TrafficLightState getState() {
        return state;
    }

    public TrafficLight(){
        this.state = new RedLightState();
    }

    public void change(){
        state.next(this);
    }

    public void reportState(){
        state.reportState();
    }
}
