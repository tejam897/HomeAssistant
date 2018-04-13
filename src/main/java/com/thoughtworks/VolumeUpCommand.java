package com.thoughtworks;

public class VolumeUpCommand implements Command{
    private HomeTheatre homeTheater;

    public VolumeUpCommand(HomeTheatre homeTheater) {
        this.homeTheater = homeTheater;
    }

    @Override
    public void execute() {
        homeTheater.volumeUp();
    }

    @Override
    public void undo() {
        homeTheater.volumeDown();
    }
}
