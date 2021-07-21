package ru.job4j.comparator;

import java.util.Comparator;

public class LexSort implements Comparator<String> {

    @Override
    public int compare(String left, String right) {
        return left.charAt(0).equals(right.charAt(0));
    }
}
