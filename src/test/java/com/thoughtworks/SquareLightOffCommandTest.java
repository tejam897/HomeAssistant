package com.thoughtworks;

import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class SquareLightOffCommandTest {

    private SquareLight mockedLight;
    private SquareLightOffCommand command;

    @Before
    public void setUp() throws Exception {
        mockedLight = mock(SquareLight.class);
        command = new SquareLightOffCommand(mockedLight);
    }

    @Test
    public void shouldTurnOffTheGivenLight() {
        command.execute();
        verify(mockedLight).turnOff();
    }

    @Test
    public void shouldTurnOnTheGivenLightOnUndo() {
        command.undo();
        verify(mockedLight).turnOn();
    }
}
