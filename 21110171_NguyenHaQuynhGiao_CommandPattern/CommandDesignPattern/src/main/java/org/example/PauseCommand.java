package org.example;

public class PauseCommand implements Command{

    private MusicPlayer musicPlayer;

    public PauseCommand(MusicPlayer musicPlayer){
        this.musicPlayer = musicPlayer;
    }

    @Override
    public void undo() {
        musicPlayer.play();
    }

    @Override
    public void execute() {
        musicPlayer.pause();
    }
}