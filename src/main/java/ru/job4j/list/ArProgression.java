package ru.job4j.list;

import java.util.List;

public class ArProgression {
    public static int checkData(List<Integer> data) {
        int sum = 0;
        for (int i = 0; i < data.size(); i++) {
            if (data.get(i) == (data.get(i - 1) + data.get(i + 1)) / 2) {
              sum = sum + data.get(i);
            }
        }
        return sum;
    }
}
