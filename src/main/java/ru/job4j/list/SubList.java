package ru.job4j.list;

import java.util.Collections;
import java.util.List;


public class SubList {
    public static List<String> getElementsBetweenIndexes(List<String> list, String el) {
        int count = 0;
        for (String s : list) {
            if (s.equals(el)) {
                count++;
            }
        }

        List<String> sheet = Collections.emptyList();
        int number = 0;
        if (!list.contains(el)) {
            sheet = sheet;
        } else if (count == 1) {
            sheet = sheet;
        } else if (count > 1) {
            for (String s : list) {
                if (s.equals(el) && number < count) {
                       sheet.add(s);
                       number++;
                }
            }
        }
        return sheet;
    }
}
