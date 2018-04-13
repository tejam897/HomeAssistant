package com.thoughtworks;

public class HomeTheatre implements Appliance{
    private boolean playingMusic;
    private boolean musicPlayerOn;
    private int volume;

    public HomeTheatre() {
        this.musicPlayerOn = false;
        this.playingMusic = false;
        this.volume = 0;
    }


    public void musicPlayerOn() {
        this.musicPlayerOn = true;
    }

    public void musicPlayerOff() {
        this.playingMusic = false;
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

    public int volumeUp() {
        if (volume < 5) volume++;
        return volume;
    }

    public int volumeDown() {
        if (volume>0) volume--;
        return volume;
    }

    public int volumeFull() {
        volume = 5;
        return volume;
    }
}
