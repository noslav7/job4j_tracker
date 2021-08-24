package ru.job4j.list;

import java.util.ArrayList;
import java.util.List;

public class GeomProgression {
    public static int generateAndSum(int first, int denominator, int count) {
        int[] geomArray = new int[count];
        geomArray[0] = first;
        for (int i = 1; i < count; i++) {
            geomArray[i] = (int) (geomArray[0] * Math.pow(denominator, i));
        }
        int sum = 0;
        for (int cell: geomArray) {
            sum = sum + cell;
        }
        return sum;
    }
}
