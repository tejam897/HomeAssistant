package com.thoughtworks;

public class VolumeDownCommand implements Command{
    private HomeTheatre homeTheater;

    public VolumeDownCommand(HomeTheatre homeTheater) {

        this.homeTheater = homeTheater;
    }

    @Override
    public void execute() {
        homeTheater.volumeDown();
    }

    @Override
    public void undo() {
        homeTheater.volumeUp();
    }
}
