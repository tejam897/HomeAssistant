package com.thoughtworks;

public class SquareLightOnCommand implements Command {
    private final SquareLight squareLight;

    public SquareLightOnCommand(SquareLight squareLight) {
        this.squareLight = squareLight;
    }

    @Override
    public void execute() {
        squareLight.turnOn();
    }

    @Override
    public void undo() {
        squareLight.turnOff();
    }
}
