package org.example;

public class Caretaker {
    private TextEditorMemento memento;
    public Caretaker(){
        this.memento = null;
    }

    public void save(TextEditor textEditor){
        this.memento = textEditor.save();
    }

    public void undo(TextEditor textEditor){
        if(memento != null){
            textEditor.restore(memento);
            this.memento = null;
        } else {
            System.out.println("No sate to restore");
        }
    }
}
