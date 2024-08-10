package org.example;

public class People {
    private PeopleState state;

    public PeopleState getState() {
        return state;
    }

    public void setState(PeopleState state) {
        this.state = state;
    }

    public People(){
        this.state = new NormalState();
    }

    public void study(){
        state.study(this);
    }

    public void entertaiment(){
        state.entertaiment(this);
    }

    public void work(){
        state.work(this);
    }
}
