package com.thoughtworks;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CircularLightTest {

    @Test
    public void shouldBeAbleToTurnOnTheLight() {
        CircularLight circularLight = new CircularLight();
        circularLight.switchOn();
        assertTrue(circularLight.isOn());
    }

    @Test
    public void shouldBeAbleToSwitchedOffTheLight() {
        CircularLight circularLight = new CircularLight();
        circularLight.switchOn();
        circularLight.switchOff();
        assertFalse(circularLight.isOn());
    }
}
