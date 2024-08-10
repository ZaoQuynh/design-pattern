package org.example;

public class Main {
    public static void main(String[] args) {
        PlaylistMediator mediator = new MusicPlaylist();
        MusicApp musicApp = new MusicApp(mediator);

        String playlistName1 = "My Music 1";
        String playlistName2 = "My Music 2";

        musicApp.createPlayList(playlistName1);
        musicApp.createPlayList(playlistName2);

        Song song1 = new Song("Mau mat nhung", "Duc Huy", "https://www.youtube.com/watch?v=mtC3ADmaeUU");
        Song song2 = new Song("Ngay Xa Anh", "My Linh", "https://www.youtube.com/watch?v=ONHK6yic5YA");
        Song song3 = new Song("Mot Lan Va Mai Mai", "My Tam", "https://www.youtube.com/watch?v=UKSfDqd3t_o");
        Song song4 = new Song("Co Doi Khi", "Uyen Linh", "https://www.youtube.com/watch?v=-ghKiWMh89E");

        musicApp.addSong(playlistName1, song1);
        musicApp.addSong(playlistName1, song2);

        musicApp.addSong(playlistName2, song3);
        musicApp.addSong(playlistName2, song4);

        musicApp.removeSong(playlistName1, song1);
        musicApp.removeSong(playlistName2, song2);
    }
}