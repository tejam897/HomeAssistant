package com.thoughtworks;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class PartyModeCommandTest {
    @Test
    public void shouldExecutePartyModeCommand() {
        PartyModeCommand command = new PartyModeCommand();
        SquareLightOnCommand mockedTurnOnCommand= mock(SquareLightOnCommand.class);
        CircularLightOnCommand mockedCircularLight = mock(CircularLightOnCommand.class);
        PlayHomeTheaterCommand mockedHomeTheater = mock(PlayHomeTheaterCommand.class);
        FullVolumeCommand fullVolume = mock(FullVolumeCommand.class);
        command.add(mockedTurnOnCommand);
        command.add(mockedCircularLight);
        command.add(mockedHomeTheater);
        command.add(fullVolume);
        command.execute();
        verify(mockedTurnOnCommand).execute();
        verify(mockedCircularLight).execute();
        verify(mockedHomeTheater).execute();
        verify(fullVolume).execute();
    }

}
