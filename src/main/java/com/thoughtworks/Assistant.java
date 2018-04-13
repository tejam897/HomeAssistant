package com.thoughtworks;

import java.util.ArrayList;
import java.util.HashMap;

public class Assistant {

    private final HashMap<String, Command> applianceControllers;
    private ArrayList<Command> previousActions;


    public Assistant() {
        this.previousActions = new ArrayList<>();
        this.applianceControllers = new HashMap<>();
    }

    public void add(String command,Command controller) {
        applianceControllers.put(command,controller);
    }

    public void listen(String instruction) {
        Command command;
        if(instruction == "undo" && previousActions.size() > 0) {
           command = previousActions.remove(previousActions.size()-1);
           command.undo();
           return;
        }
        command = applianceControllers.get(instruction);
        if(command != null) {
            previousActions.add(command);
            command.execute();
        }
    }
}
