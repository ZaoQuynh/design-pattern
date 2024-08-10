package org.example;

public class TrafficLight {
    private TrafficMediator mediator;
    private String direction;

    public TrafficLight(TrafficMediator mediator, String direction){
        this.mediator = mediator;
        this.direction = direction;
        this.mediator.registerLight(this, direction);
    }

    public void changeLight(String color){
        System.out.println(direction + " light turned " + color);
    }

    public void sendSignal(String signal){
        this.mediator.receiveSignal(signal, direction);
    }
}
