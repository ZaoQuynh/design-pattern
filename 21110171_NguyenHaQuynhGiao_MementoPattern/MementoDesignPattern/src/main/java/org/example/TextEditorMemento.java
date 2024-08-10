package org.example;

public class TextEditorMemento {
    private String state;

    public String getState() {
        return state;
    }

    public TextEditorMemento(String state){
        this.state = state;
    }
}
