package ru.job4j.comparator;

import java.util.Comparator;
import java.util.List;

public class ListSort {
    public static List<String> sort(List<String> data) {
        data.sort(Comparator.naturalOrder());
        for (int i = 0; i < data.size() / 2; i++) {
            if (data.get(i).equals("null")) {
                String temp = data.get(i);
                data.set(i, data.get(data.size() - i - 1));
                data.set(data.size() - i - 1, temp);
            }
        }
        return data;
    }
}
