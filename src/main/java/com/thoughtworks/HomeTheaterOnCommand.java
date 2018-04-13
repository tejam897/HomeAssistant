package com.thoughtworks;

public class HomeTheaterOnCommand implements Command{
    private HomeTheatre homeTheater;

    public HomeTheaterOnCommand(HomeTheatre homeTheater) {
        this.homeTheater = homeTheater;
    }

    @Override
    public void execute() {
        homeTheater.musicPlayerOn();
    }

    @Override
    public void undo() {
        homeTheater.musicPlayerOff();
    }
}
