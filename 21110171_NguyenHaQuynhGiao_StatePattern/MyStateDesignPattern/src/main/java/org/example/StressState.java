package org.example;

public class StressState implements PeopleState {
    @Override
    public void study(People people) {
        System.out.println("Having difficulty concentrating on studying, experiencing slow and ineffective knowledge absorption.");
    }

    @Override
    public void entertaiment(People people) {
        System.out.println("Lacking interest in participating in recreational activities.");
        people.setState(new NormalState());
    }

    @Override
    public void work(People people) {
        System.out.println("Working ineffectively.");
    }
}
