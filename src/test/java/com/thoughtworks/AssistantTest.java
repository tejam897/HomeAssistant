package com.thoughtworks;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class AssistantTest {
    @Test
    public void shouldTurnOffTheLight() {
        Assistant assistant = new Assistant();
        SquareLight squareLight = mock(SquareLight.class);
        assistant.add(squareLight);
        assistant.listen("Turn On");
        verify(squareLight).turnOn();
    }
}
