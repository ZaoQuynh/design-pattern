package org.example;

public class SouthTrafficLight extends TrafficLight {

    public SouthTrafficLight(TrafficMediator mediator){
        super(mediator, "South");
    }

    @Override
    public void changeLight(String signal) {
        super.changeLight(signal);
    }

    @Override
    public void sendSignal(String string) {
        super.sendSignal(string);
    }
}
