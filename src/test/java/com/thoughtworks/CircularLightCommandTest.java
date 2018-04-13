package com.thoughtworks;

import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class CircularLightCommandTest {

    private CircularLight mockedLight;
    private CircularLightOnCommand command;

    @Before
    public void setUp() {
        mockedLight = mock(CircularLight.class);
        command = new CircularLightOnCommand(mockedLight);
    }

    @Test
    public void shouldTurnOnTheCircularLight() {
        command.execute();
        verify(mockedLight).switchOn();
    }

    @Test
    public void shouldUndoTheCommand() {
       command.undo();
       verify(mockedLight).switchOff();
    }
}
