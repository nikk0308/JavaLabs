package org.example.Task34;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task34InheritedTest {

    Task34Inherited task34Inherited;

    @BeforeEach
    void setUp() {
        task34Inherited = new Task34Inherited("Xiaomi", 200, 8, 256,
                true, 2.4, 4, 8);
    }

    @Test
    void getDescription() {
        String actual = task34Inherited.getDescription();
        String expected = "Xiaomi, 200.0, 8.0, 256, true, 2.4, 4, 8";
        assertEquals(expected, actual);
    }
}