package org.example;

public class Client {

    public static void main(String[] args) {
        MusicPlayer musicPlayer = new MusicPlayer();
        RemoteControl remoteControl = new RemoteControl();

        Command play = new PlayCommand(musicPlayer);
        Command pause = new PauseCommand(musicPlayer);

        remoteControl.executeCommand(play);
        remoteControl.executeCommand(pause);
        remoteControl.undoCommand();
    }
}