package com.thoughtworks;

public class SquareLight implements Appliance{
    private boolean switchedOn;

    public SquareLight() {
        this.switchedOn = false;
    }

    public void turnOn()  {
        this.switchedOn = true;
    }

    public boolean isOn() {
        return switchedOn;
    }

    public void turnOff() {
        this.switchedOn = false;
    }
}
