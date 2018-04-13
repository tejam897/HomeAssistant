package com.thoughtworks;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class HomeTheatreTest {

    @Test
    public void shouldBeAbleToDoHomeTheatreOn() {
        HomeTheatre homeTheatre = new HomeTheatre();
        homeTheatre.musicPlayerOn();
        assertTrue(homeTheatre.isMusicPlayerOn());
    }

    @Test
    public void shouldBeAbleToDoHomeTheatreOff() {
        HomeTheatre homeTheatre = new HomeTheatre();
        homeTheatre.musicPlayerOff();
        assertFalse(homeTheatre.isMusicPlayerOn());
    }

    @Test
    public void shouldBeAbleToPlayTheMusic() {
        HomeTheatre homeTheatre = new HomeTheatre();
        homeTheatre.musicPlayerOn();
        homeTheatre.playMusic();
        assertTrue(homeTheatre.isMusicPlaying());
    }
}
