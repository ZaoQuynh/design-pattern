package org.example;

public class MusicApp {
    private PlaylistMediator mediator;

    public MusicApp(PlaylistMediator mediator){
        this.mediator = mediator;
    }

    public void createPlayList(String playListName){
        mediator.createPlayList(playListName);
    }
    public void addSong(String playlistName, Song song){
        mediator.addSong(playlistName, song);
    }
    public void removeSong(String playlistName, Song song){
        mediator.removeSong(playlistName, song);
    }
}
