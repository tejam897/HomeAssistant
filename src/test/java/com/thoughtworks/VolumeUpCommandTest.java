package com.thoughtworks;

import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class VolumeUpCommandTest {

    private HomeTheatre mockedHomeTheater;
    private VolumeUpCommand command;

    @Before
    public void setUp() throws Exception {
        mockedHomeTheater = mock(HomeTheatre.class);
        command = new VolumeUpCommand(mockedHomeTheater);
    }

    @Test
    public void shouldIncreaseTheVolumeOfGivenHomeTheater() {
        command.execute();
        verify(mockedHomeTheater).volumeUp();
    }

    @Test
    public void shouldDecreaseTheVolumeOfGivenHomeTheatreOfGivenHomeTheatre() {
        command.undo();
        verify(mockedHomeTheater).volumeDown();
    }
}
