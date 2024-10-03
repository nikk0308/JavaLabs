package org.example;

public class Task9 {
    public int[] formArrayB(int[] a) {
        int[] b = new int[a.length];
        int evenIndex = 0;
        int oddIndex = a.length - 1;

        for (int value : a) {
            if (value % 2 == 0) {
                insertSorted(b, evenIndex++, value, true);
            } else {
                insertSorted(b, oddIndex--, value, false);
            }
        }

        return b;
    }

    private void insertSorted(int[] b, int index, int value, boolean isEven) {
        if (isEven) {
            int i = index - 1;
            while (i >= 0 && b[i] > value) {
                b[i + 1] = b[i];
                i--;
            }
            b[i + 1] = value;
        } else {
            int i = index + 1;
            while (i < b.length && b[i] > value) {
                b[i - 1] = b[i];
                i++;
            }
            b[i - 1] = value;
        }
    }
}
