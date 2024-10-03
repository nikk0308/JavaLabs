package org.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task19 {
    public int[] getUniqueElements(int[] a) {
        Set<Integer> allElements = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();
        List<Integer> list = new ArrayList<>();

        for (int value : a) {
            if (!allElements.add(value)) {
                duplicates.add(value);
            }
        }

        for (int number : a) {
            if (!duplicates.contains(number)) {
                list.add(number);
            }
        }

        int[] uniqueArray = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            uniqueArray[i] = list.get(i);
        }

        return uniqueArray;
    }
}
