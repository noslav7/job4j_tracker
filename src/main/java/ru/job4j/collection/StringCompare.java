package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {

    @Override
    public int compare(String left, String right) {
       for (int i = 0; i < Math.min(left.length(), right.length()); i++) {
            char charLeft = left.charAt(i);
            char charRight = right.charAt(i);
            if (charLeft != charRight) {
                return Character.compare(charLeft, charRight);
            }
        }
        return Integer.compare(left.length(), right.length());
    }
}
