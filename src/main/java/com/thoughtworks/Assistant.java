package com.thoughtworks;

import java.util.HashMap;

public class Assistant {

    private final HashMap<String, Appliance> applianceCommands;
    private final HashMap<String, DeviceController> applianceControllers;

    public Assistant() {
        this.applianceCommands = new HashMap<>();
        this.applianceControllers = new HashMap<>();
    }

    public void add(SquareLight squareLight) {
        applianceCommands.put("Turn On",squareLight);
        DeviceController squareLightOnController = new SquareLightOnController(squareLight);
        applianceControllers.put("Turn On",squareLightOnController);
    }

    public void listen(String instruction) {
        DeviceController controller = applianceControllers.get(instruction);
        controller.execute();
    }
}
