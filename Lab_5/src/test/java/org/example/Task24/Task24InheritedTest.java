package org.example.Task24;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task24InheritedTest {

    Task24Inherited task24Inherited;

    @BeforeEach
    void setUp() {
        task24Inherited = new Task24Inherited(1, 2, 3, 4, "white",
                "Hello world", "black");
    }

    @Test
    void getDescription() {
        String actual = task24Inherited.getDescription();
        String expected = "1, 2, 3, 4, white, Hello world, black";
        assertEquals(expected, actual);
    }
}