package com.thoughtworks;

import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class HomeTheaterOffCommandTest {

    private HomeTheatre mockedHomeTheater;
    private HomeTheaterOffCommand command;

    @Before
    public void setUp() throws Exception {
        mockedHomeTheater = mock(HomeTheatre.class);
        command = new HomeTheaterOffCommand(mockedHomeTheater);
    }

    @Test
    public void shouldTurnOffTheGivenHomeTheater() {
        command.execute();
        verify(mockedHomeTheater).musicPlayerOff();
    }

    @Test
    public void shouldTurnOnTheGivenHomeTheatreOnUndo() {
        command.undo();
        verify(mockedHomeTheater).musicPlayerOn();
    }
}
