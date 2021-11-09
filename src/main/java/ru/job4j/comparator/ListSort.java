package ru.job4j.comparator;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListSort {
    public static List<String> sort(List<String> data) {
        data.sort(Comparator.nullsLast(Collections.reverseOrder()));
        return data;
    }
}
