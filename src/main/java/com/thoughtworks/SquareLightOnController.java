package com.thoughtworks;

public class SquareLightOnController implements DeviceController {
    private final SquareLight squareLight;

    public SquareLightOnController(SquareLight squareLight) {
        this.squareLight = squareLight;
    }

    @Override
    public void execute() {
        squareLight.turnOn();
    }
}
