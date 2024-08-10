package org.example;

public interface PlaylistMediator {
    public void createPlayList(String playListName);
    public void addSong(String playlistName, Song song);
    public void removeSong(String playlistName, Song song);
}
