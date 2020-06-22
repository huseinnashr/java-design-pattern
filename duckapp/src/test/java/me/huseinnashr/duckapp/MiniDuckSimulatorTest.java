package me.huseinnashr.duckapp;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import java.io.PrintStream;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;

public class MiniDuckSimulatorTest {

    @Test
    public void testMain() {
        PrintStream out = mock(PrintStream.class);
        System.setOut(out);

        MiniDuckSimulator.main();

        ArgumentCaptor<String> argumentCaptor = ArgumentCaptor.forClass(String.class);
        verify(out, times(4)).println(argumentCaptor.capture());

        List<String> arguments = argumentCaptor.getAllValues();
        assertEquals("Quack", arguments.get(0));
        assertEquals("I'm flying!!", arguments.get(1));
        assertEquals("I can't fly", arguments.get(2));
        assertEquals("I'm flying with a rocket!", arguments.get(3));
    }
}
