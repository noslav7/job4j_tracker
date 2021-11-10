package ru.job4j.comparator;

import java.util.*;

public class SortBySetUsingComparator {

    public static Set<String> sort(List<String> list) {
        Collections.sort(list, Comparator.reverseOrder());
        Set<String> set = new TreeSet(list);
        return set;
    }
}
