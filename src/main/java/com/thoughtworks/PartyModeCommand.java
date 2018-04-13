package com.thoughtworks;

import java.util.ArrayList;

public class PartyModeCommand implements Command{
    private ArrayList<Command> commands;

    public PartyModeCommand() {
        this.commands = new ArrayList<>();
    }

    public void add(Command command){
        commands.add(command);
    }

    @Override
    public void execute() {
        for (Command command : commands) {
            command.execute();
        }
    }

    @Override
    public void undo() {
        for (Command command : commands) {
            command.undo();
        }
    }
}
