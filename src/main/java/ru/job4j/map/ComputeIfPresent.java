package ru.job4j.map;

import java.util.Map;

public class ComputeIfPresent {

    public static Map<Integer, String> collectData(
            Map<Integer, String> name, Map<Integer, String> surname) {
        name.computeIfPresent(1, (key, value) -> name.get(1) + " " + surname.get(1));
        name.computeIfPresent(2, (key, value) -> name.get(2) + " " + surname.get(2));
        return name;
    }
}
