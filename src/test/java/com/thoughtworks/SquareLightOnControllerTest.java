package com.thoughtworks;

import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class SquareLightOnControllerTest {

    private SquareLight mockedLight;
    private SquareLightOnCommand controller;

    @Before
    public void setUp() throws Exception {
        mockedLight = mock(SquareLight.class);
        controller = new SquareLightOnCommand(mockedLight);
    }

    @Test
    public void shouldTurnOnTheGivenLight() {
        controller.execute();
        verify(mockedLight).turnOn();
    }

    @Test
    public void shouldTurnOffOnUndo() {
        controller.undo();
        verify(mockedLight).turnOff();
    }
}
