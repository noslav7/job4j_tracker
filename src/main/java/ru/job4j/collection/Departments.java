package ru.job4j.collection;

import java.util.ArrayList;
import java.util.List;

public class Departments {
    public static List<String> fillGaps(List<String> deps) {
        List<String> rsl = new ArrayList<>();
        for (String value : deps) {
            String start = "";
            for (String el : value.split("/")) {
                 rsl.add(start + "/" + el);
            }
        }
        return new ArrayList<>(rsl);
    }

    public static void sortAsc(List<String> orgs) {
    }

    public static void sortDesc(List<String> orgs) {
    }
}
