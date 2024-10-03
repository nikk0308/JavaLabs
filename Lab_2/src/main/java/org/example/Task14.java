package org.example;

import java.util.HashSet;
import java.util.Set;

public class Task14 {
    public boolean isSet(int[] a) {
        Set<Integer> set = new HashSet<>();

        for (int value : a) {
            if (set.contains(value)) {
                return false;
            }
            set.add(value);
        }
        return true;
    }
}
