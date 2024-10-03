package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;


class Task19Test {

    private Task19 task19 = new Task19();
    private int[] _testArray;

    @BeforeEach
    void setUp() {
        _testArray = new int[]{1, 12, 13, 14, 15, 6, 7, 8, 9, 10, 10, 12, 13, 14, 15, 16};
    }

    @Test
    void getUniqueElements() {
        int[] result = task19.getUniqueElements(_testArray);
        int[] expected = {1, 6, 7, 8, 9, 16};
        assertTrue(Arrays.equals(expected, result));
    }
}