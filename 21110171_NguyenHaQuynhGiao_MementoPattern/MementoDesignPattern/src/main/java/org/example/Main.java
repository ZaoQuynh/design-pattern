package org.example;

public class Main {

    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor();
        Caretaker caretaker = new Caretaker();

        textEditor.setText("Text1");
        System.out.println(textEditor.getText());
        caretaker.save(textEditor);
        textEditor.setText("Text2");
        System.out.println(textEditor.getText());
        caretaker.undo(textEditor);
        System.out.println(textEditor.getText());
    }
}