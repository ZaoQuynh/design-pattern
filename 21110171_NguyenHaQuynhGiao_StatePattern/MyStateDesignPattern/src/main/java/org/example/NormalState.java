package org.example;

public class NormalState implements PeopleState {
    @Override
    public void study(People people) {
        System.out.println("Focusing on studying effectively.");
    }

    @Override
    public void entertaiment(People people) {
        System.out.println("Participating in recreational activities in moderation.");
        people.setState(new HappyState());
    }

    @Override
    public void work(People people) {
        System.out.println("Completing tasks efficiently.");
        people.setState(new StressState());
    }
}
