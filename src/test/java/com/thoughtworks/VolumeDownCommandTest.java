package com.thoughtworks;

import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class VolumeDownCommandTest {

    private HomeTheatre mockedHomeTheater;
    private VolumeDownCommand command;

    @Before
    public void setUp() throws Exception {
        mockedHomeTheater = mock(HomeTheatre.class);
        command = new VolumeDownCommand(mockedHomeTheater);
    }

    @Test
    public void shouldDecreaseTheVolumeOfGivenHomeTheater() {
        command.execute();
        verify(mockedHomeTheater).volumeDown();
    }

    @Test
    public void shouldIncreaseTheVolumeOfGivenHomeTheatreOnUndo() {
        command.undo();
        verify(mockedHomeTheater).volumeUp();
    }
}
