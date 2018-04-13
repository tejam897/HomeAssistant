package com.thoughtworks;

public class CircularLight implements Appliance {
    private boolean switchedOn;

    public CircularLight() {
        this.switchedOn = false;
    }

    public void switchOn()  {
        this.switchedOn = true;
    }

    public boolean isOn() {
        return switchedOn;
    }

    public void switchOff() {
        this.switchedOn = false;
    }
}
