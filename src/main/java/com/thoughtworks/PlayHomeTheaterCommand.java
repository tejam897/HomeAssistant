package com.thoughtworks;

public class PlayHomeTheaterCommand implements Command{
    private HomeTheatre homeTheater;

    public PlayHomeTheaterCommand(HomeTheatre homeTheater) {
        this.homeTheater = homeTheater;
    }

    @Override
    public void execute() {
        homeTheater.playMusic();
    }

    @Override
    public void undo() {

    }
}
