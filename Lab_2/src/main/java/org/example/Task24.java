package org.example;

public class Task24 {
    public int getDayOfYear(int day, int month, boolean isLeapYear) {
        int[] daysBeforeMonth = {0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334};

        int dayNumber = daysBeforeMonth[month - 1] + day;
        if (isLeapYear && month > 2) {
            dayNumber++;
        }
        return dayNumber;
    }
}
