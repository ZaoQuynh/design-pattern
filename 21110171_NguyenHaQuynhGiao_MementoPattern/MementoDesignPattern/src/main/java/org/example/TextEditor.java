package org.example;

public class TextEditor {

    private String text;

    public String getText(){
        return this.text;
    }

    public void setText(String text){
        this.text = text;
    }

    public TextEditor(){
        this.text = "";
    }

    public TextEditorMemento save(){
        return new TextEditorMemento(text);
    }

    public void restore(TextEditorMemento textEditorMemento){
        this.text = textEditorMemento.getState();
    }
}
