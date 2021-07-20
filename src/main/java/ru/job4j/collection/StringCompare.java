package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {

    @Override
    public int compare(String left, String right) {
        int result = 0;
        int resultsSum = 0;
        for (int i = 0; i < Math.min(left.length(), right.length()); i++) {
            char charLeft = left.charAt(i);
            char charRight = right.charAt(i);
            if (Character.compare(charLeft, charRight) != 0) {
                result = charLeft - charRight;
                resultsSum = resultsSum + result;
            }
        }
        return resultsSum;
    }
}
