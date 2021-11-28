package ru.job4j.collection;

import java.util.Comparator;

public class DepDescComp implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        String[] firstArray = o1.split("/");
        String[] secondArray = o2.split("/");
        int rsl = secondArray[0].compareTo(firstArray[0]);
        if (rsl == 0) {
            return o1.compareTo(o2);
        } else {
            return rsl;
        }
    }
}
