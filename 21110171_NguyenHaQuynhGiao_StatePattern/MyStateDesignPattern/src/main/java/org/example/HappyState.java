package org.example;

public class HappyState implements PeopleState {
    @Override
    public void study(People people) {
        System.out.println("A better study mindset involves quickly and effectively absorbing knowledge.");
    }

    @Override
    public void entertaiment(People people) {
        System.out.println("Engaging in recreational activities with enthusiasm and zeal.");
    }

    @Override
    public void work(People people) {
        System.out.println("Working more efficiently and productively.");
        people.setState(new NormalState());
    }
}
