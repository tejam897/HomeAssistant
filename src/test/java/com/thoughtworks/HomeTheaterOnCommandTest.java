package com.thoughtworks;

import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class HomeTheaterOnCommandTest {

    private HomeTheatre mockedHomeTheater;
    private HomeTheaterOnCommand command;

    @Before
    public void setUp() throws Exception {
        mockedHomeTheater = mock(HomeTheatre.class);
        command = new HomeTheaterOnCommand(mockedHomeTheater);
    }

    @Test
    public void shouldOnTheGivenHomeTheater() {
        command.execute();
        verify(mockedHomeTheater).musicPlayerOn();
    }

    @Test
    public void shouldOffTheGivenHomeTheatreOnUndo() {
        command.undo();
        verify(mockedHomeTheater).musicPlayerOff();
    }
}
