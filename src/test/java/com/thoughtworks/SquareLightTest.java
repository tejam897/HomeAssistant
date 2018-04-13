package com.thoughtworks;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SquareLightTest {

    @Test
    public void shouldBeAbleToTurnOnTheLight() {
        SquareLight squareLight = new SquareLight();
        squareLight.turnOn();
        assertTrue(squareLight.isOn());
    }

    @Test
    public void shouldBeAbleToSwitchedOffTheLight() {
        SquareLight squareLight = new SquareLight();
        squareLight.turnOn();
        squareLight.turnOff();
        assertFalse(squareLight.isOn());
    }

}
