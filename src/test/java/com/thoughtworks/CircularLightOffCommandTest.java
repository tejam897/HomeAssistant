package com.thoughtworks;

import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class CircularLightOffCommandTest {

    private CircularLight mockedLight;
    private CircularLightOffCommand command;

    @Before
    public void setUp() {
        mockedLight = mock(CircularLight.class);
        command = new CircularLightOffCommand(mockedLight);
    }

    @Test
    public void shouldTurnOffTheCircularLight() {
        command.execute();
        verify(mockedLight).switchOff();
    }

    @Test
    public void shouldTurnOnTheLightOnUndo() {
        command.undo();
        verify(mockedLight).switchOn();
    }
}

