package me.huseinnashr.duckapp;

import static org.mockito.ArgumentMatchers.contains;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import java.io.PrintStream;

import org.junit.jupiter.api.Test;

public class MiniDuckSimulatorTest {

    @Test
    public void testMain() {
        PrintStream out = mock(PrintStream.class);
        System.setOut(out);

        MiniDuckSimulator.main();

        verify(out).println(contains("Quack"));
        verify(out).println(contains("I'm flying"));
    }
}
