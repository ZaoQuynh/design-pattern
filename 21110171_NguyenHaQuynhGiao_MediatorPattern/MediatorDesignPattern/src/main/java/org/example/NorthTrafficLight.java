package org.example;

public class NorthTrafficLight extends TrafficLight {

    public NorthTrafficLight(TrafficMediator mediator){
        super(mediator, "North");
    }

    @Override
    public void changeLight(String string) {
        super.changeLight(string);
    }

    @Override
    public void sendSignal(String string) {
        super.sendSignal(string);
    }
}