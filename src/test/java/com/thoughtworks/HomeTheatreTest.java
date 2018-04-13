package com.thoughtworks;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class HomeTheatreTest {

    private HomeTheatre homeTheatre;

    @Before
    public void setUp() throws Exception {
        homeTheatre = new HomeTheatre();
    }

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
        HomeTheatre homeTheatre = this.homeTheatre;
        homeTheatre.musicPlayerOn();
        homeTheatre.playMusic();
        assertTrue(homeTheatre.isMusicPlaying());
    }

    @Test
    public void shouldBeAbleToIncreaseTheVolume() {
        assertThat(homeTheatre.volumeUp(),is(1));
    }

    @Test
    public void shouldNotBeAbleToIncreaseTheVolumeAboveThan5() {
        assertThat(homeTheatre.volumeUp(),is(1));
        homeTheatre.volumeUp();
        homeTheatre.volumeUp();
        homeTheatre.volumeUp();
        homeTheatre.volumeUp();
        homeTheatre.volumeUp();
        assertThat(homeTheatre.volumeUp(),is(5));
    }

    @Test
    public void shouldBeABleToDecreaseTheVolume() {
        homeTheatre.volumeUp();
        assertThat(homeTheatre.volumeDown(),is(0));
    }

    @Test
    public void shouldNotDecreaseTheVolumeLessThan0() {
        assertThat(homeTheatre.volumeDown(),is(0));
        assertThat(homeTheatre.volumeDown(),is(0));
    }

    @Test
    public void shouldSetVolumeToFull() {
        assertThat(homeTheatre.volumeFull(),is(5));

    }
}
