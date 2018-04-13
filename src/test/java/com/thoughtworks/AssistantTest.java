package com.thoughtworks;

import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;

public class AssistantTest {

    private Assistant assistant;

    @Before
    public void setUp() throws Exception {
        assistant = new Assistant();
    }

    @Test
    public void shouldTurnOffTheLight() {
        SquareLightOnCommand controller = mock(SquareLightOnCommand.class);
        assistant.add("Turn On", controller);
        assistant.listen("Turn On");
        verify(controller).execute();
    }

    @Test
    public void shouldNotRespondIfNoSuchInstruction() {
        assistant.listen("How are you");
    }

    @Test
    public void shouldUndoPreviousCommand() {
        SquareLightOnCommand controller = mock(SquareLightOnCommand.class);
        assistant.add("Turn On", controller);
        assistant.listen("Turn On");
        assistant.listen("undo");
        verify(controller).undo();
    }
    @Test
    public void shouldNotUndoPreviousCommandIfPreviousCommandNull() {
        SquareLightOnCommand controller = mock(SquareLightOnCommand.class);
        assistant.listen("undo");
        verifyNoMoreInteractions(controller);
    }

    @Test
    public void shouldAbleToDoMultipleUndoOfPreviousCommand() {
        SquareLightOnCommand onController = mock(SquareLightOnCommand.class);
        SquareLightOffCommand offController = mock(SquareLightOffCommand.class);
        assistant.add("Turn On", onController);
        assistant.add("Turn Off", offController);
        PlayHomeTheaterCommand homeTheater = mock(PlayHomeTheaterCommand.class);
        assistant.add("Music On",homeTheater);
        assistant.listen("Music On");
        assistant.listen("Turn On");
        assistant.listen("Turn Off");
        assistant.listen("undo");
        verify(offController).undo();
        assistant.listen("undo");
        verify(onController).undo();
        assistant.listen("undo");
        verify(homeTheater).undo();
    }

}
