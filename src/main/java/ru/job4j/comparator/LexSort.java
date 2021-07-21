package ru.job4j.comparator;

import java.util.Comparator;

public class LexSort implements Comparator<String> {

    @Override
    public int compare(String left, String right) {
        return String.compareTo(left.charAt(0), right.charAt(0));
    }
}
