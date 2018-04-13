package com.thoughtworks;

public class FullVolumeCommand implements Command{
    private HomeTheatre homeTheater;

    public FullVolumeCommand(HomeTheatre homeTheater) {
        this.homeTheater = homeTheater;
    }

    @Override
    public void execute() {
        homeTheater.volumeFull();
    }

    @Override
    public void undo() {

    }
}
