package com.thoughtworks;

public class CircularLightOnCommand implements Command{
    private CircularLight light;

    public CircularLightOnCommand(CircularLight light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.switchOn();
    }

    @Override
    public void undo() {
        light.switchOff();
    }
}
