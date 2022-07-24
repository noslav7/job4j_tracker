package ru.job4j.hash;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static List<Integer> extractUnique(List<Integer> left, List<Integer> right) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < right.size(); i++) {
            boolean flag = true;
            for (int j = 0; j < left.size(); j++) {
                if (right.get(i).equals(left.get(j))) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                result.add(right.get(i));
            }
        }
        for (int i = 0; i < left.size(); i++) {
            boolean flag = true;
            for (int j = 0; j < right.size(); j++) {
                if (left.get(i).equals(right.get(j))) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                result.add(left.get(i));
            }
        }
        return result;
    }
}
