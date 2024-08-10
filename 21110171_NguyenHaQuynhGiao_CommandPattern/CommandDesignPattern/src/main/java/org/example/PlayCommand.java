package org.example;

public class PlayCommand implements Command{
    private MusicPlayer musicPlayer;
    public PlayCommand(MusicPlayer musicPlayer){
        this.musicPlayer = musicPlayer;
    }
    @Override
    public void undo() {
        musicPlayer.stop();
    }
    @Override
    public void execute() {
        musicPlayer.play();
    }
}
