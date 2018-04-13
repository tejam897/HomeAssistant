package com.thoughtworks;

public class SquareLightOffCommand implements Command{
    private SquareLight light;

    public SquareLightOffCommand(SquareLight light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOff();
    }

    @Override
    public void undo() {
        light.turnOn();
    }
}
