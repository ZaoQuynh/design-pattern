package org.example;

import java.util.Stack;

public class RemoteControl {
    private Stack<Command> commands = new Stack<>();
    public RemoteControl(){}
    public void executeCommand(Command command){
        commands.push(command);
        command.execute();
    }
    public void undoCommand(){
        if(!commands.isEmpty()){
            commands.pop().undo();
        } else {
            System.out.println("No command");
        }
    }
}