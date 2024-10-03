package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;

class Task29Test {

    private Task29 task29 = new Task29();
    private int[] _testArray;

    @BeforeEach
    void setUp() {
        _testArray = new int[]{1, 12, 13, 14, 15, 6, 7, 8, 9, 10, 10, 12, 13, 14, 15, 16};
    }

    @Test
    void getNonUniqueElements() {
        int[] result = task29.getNonUniqueElements(_testArray);
        int[] expected = {10, 12, 13, 14, 15};
        assertTrue(Arrays.equals(expected, result));
    }
}