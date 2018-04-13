package com.thoughtworks;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class PlayHomeTheaterCommandTest {
    @Test
    public void shouldPlayMusicInGivenHomeTheater() {
        HomeTheatre mockedHomeTheater = mock(HomeTheatre.class);
        PlayHomeTheaterCommand command = new PlayHomeTheaterCommand(mockedHomeTheater);
        command.execute();
        verify(mockedHomeTheater).playMusic();
    }
}
