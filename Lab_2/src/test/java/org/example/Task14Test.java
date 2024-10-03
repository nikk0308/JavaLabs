package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Task14Test {

    private Task14 task14 = new Task14();
    private int[] _testArray;

    @BeforeEach
    void setUp() {
        _testArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 12, 13, 14, 15, 16};
    }

    @Test
    void isSet() {
        boolean result = task14.isSet(_testArray);
        boolean expected = false;
        assertEquals(expected, result);
    }
}