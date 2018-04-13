package com.thoughtworks;

import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class FullVolumeCommandTest {

    private HomeTheatre hometheater;
    private FullVolumeCommand command;

    @Before
    public void setUp() throws Exception {
        hometheater = mock(HomeTheatre.class);
        command = new FullVolumeCommand(hometheater);
    }

    @Test
    public void shouldSetVolumeToFull() {
        command.execute();
        verify(hometheater).volumeFull();
    }

}
