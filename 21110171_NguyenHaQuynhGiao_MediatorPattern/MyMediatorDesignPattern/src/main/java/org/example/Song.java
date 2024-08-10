package org.example;

public class Song {
    private String title;
    private String singer;
    private String url;

    public Song(String title, String singer, String url) {
        this.title = title;
        this.singer = singer;
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
