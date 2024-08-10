package org.example;

public class Main {

    public static void main(String[] args) {
        IntersectionMediator mediator = new IntersectionMediator();
        TrafficLight southLight = new SouthTrafficLight(mediator);
        TrafficLight northLight = new NorthTrafficLight(mediator);

        mediator.registerLight(southLight, "South");
        mediator.registerLight(northLight, "North");

        southLight.sendSignal("Green");
        northLight.sendSignal("Red");
    }
}