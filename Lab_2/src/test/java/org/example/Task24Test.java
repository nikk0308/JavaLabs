package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Task24Test {

    private Task24 task24 = new Task24();
    private int _testDay;
    private int _testMonth;
    private boolean _testIsLeapYear;

    @BeforeEach
    void setUp() {
        _testDay = 15;
        _testMonth = 3;
        _testIsLeapYear = true;
    }

    @Test
    void getDayOfYear() {
        int result = task24.getDayOfYear(_testDay, _testMonth, _testIsLeapYear);
        int expected = 75;
        assertEquals(expected, result);
    }
}