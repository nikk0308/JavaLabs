package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task24Test {

    private Task24 task24 = new Task24();

    @BeforeEach
    void setUp() {
        task24.addProgram(new StackMember("Browser", 150, 2));
        task24.addProgram(new StackMember("Video Editor", 800, 3));
        task24.addProgram(new StackMember("IDE", 400, 4));
        task24.addProgram(new StackMember("Music Player", 100, 1));
        task24.addProgram(new StackMember("Game", 1000, 5));
    }

    @Test
    void popProgram() {
        StackMember result = task24.popProgram();
        StackMember expected = new StackMember("Game", 1000, 5);
        assertEquals(expected, result);
    }
}