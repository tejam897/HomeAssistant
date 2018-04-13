package com.thoughtworks;

public class HomeTheatre {
    private boolean playingMusic;
    private boolean musicPlayerOn;

    public HomeTheatre() {
        this.musicPlayerOn = false;
        this.playingMusic = false;
    }


    public void musicPlayerOn() {
        this.musicPlayerOn = true;
    }

    public void musicPlayerOff() {
        this.musicPlayerOn = false;
    }

    public boolean isMusicPlayerOn() {
        return musicPlayerOn;
    }

    public void playMusic() {
        if(musicPlayerOn) this.playingMusic = true;
    }

    public boolean isMusicPlaying() {
        return playingMusic;
    }
}
