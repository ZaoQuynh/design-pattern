package org.example;

import java.util.ArrayList;
import java.util.List;

public class MusicPlaylist implements  PlaylistMediator{
    private List<Playlist> playLists;

    public MusicPlaylist(){
        playLists = new ArrayList<>();
    }

    @Override
    public void createPlayList(String playlistName) {
        if(this.getPlaylist(playlistName) == null){
            this.playLists.add(new Playlist(playlistName));
            System.out.println("Playlist '" + playlistName + "' created.");
        } else {
            System.out.println("Playlist '" + playlistName + "' is exist.");
        }
    }

    @Override
    public void addSong(String playlistName, Song song) {
        Playlist l = getPlaylist(playlistName);
        if(l == null){
            l = new Playlist(playlistName);
        }

        List<Song> songs = l.getSongs();

        songs.add(song);
        System.out.println("Song '" + song.getTitle() + "' added to playlist '" + l.getName() + "'.");
        l.setSongs(songs);

    }

    @Override
    public void removeSong(String playlistName, Song song) {
        Playlist l = getPlaylist(playlistName);
        if(l == null){
            System.out.println("Playlist '" + l.getName() + "' isn't exist.");
            return;
        }

        List<Song> songs = l.getSongs();

        if(songs.remove(song)) {
            System.out.println("Song '" + song.getTitle() + "' removed to playlist '" + l.getName() + "'.");
            l.setSongs(songs);
        } else {
            System.out.println("Song '" + song.getTitle() + "'  is not in the playlist '" + l.getName() + "'.");
        }
    }

    private Playlist getPlaylist(String playListName){
        for (Playlist l: this.playLists) {
            if(l.getName().equals(playListName))
                return l;
        }
        return null;
    }
}
