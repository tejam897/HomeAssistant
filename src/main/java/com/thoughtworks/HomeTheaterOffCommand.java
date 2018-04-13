package com.thoughtworks;

public class HomeTheaterOffCommand implements Command{
    private HomeTheatre homeTheater;

    public HomeTheaterOffCommand(HomeTheatre homeTheater) {
        this.homeTheater = homeTheater;
    }

    @Override
    public void execute() {
      homeTheater.musicPlayerOff();
    }

    @Override
    public void undo() {
        homeTheater.musicPlayerOn();
    }
}
