package ru.job4j.hash;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Task3 {
    public static List<Integer> extractDuplicates(List<Integer> left, List<Integer> right) {
        List<Integer> intList = new ArrayList<>();
        for (int i = 0; i < left.size(); i++) {
            for (int j = 0; j < right.size(); j++) {
                if (left.get(i).equals(right.get(j))) {
                    intList.add(left.get(i));
                    break;
                }
            }
        }
        return intList;
    }
}
