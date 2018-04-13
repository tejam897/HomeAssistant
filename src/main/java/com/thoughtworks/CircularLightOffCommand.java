package com.thoughtworks;

public class CircularLightOffCommand implements Command {
    private CircularLight light;

    public CircularLightOffCommand(CircularLight light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.switchOff();
    }

    @Override
    public void undo() {
        light.switchOn();
    }
}
