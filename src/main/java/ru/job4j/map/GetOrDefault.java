package ru.job4j.map;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GetOrDefault {
    private Map<Integer, List<String>> store = new HashMap<>();

    public void addValue(int index, List<String> list) {
        for (String string : list) {
            store.putIfAbsent(index, list);
        }
        for (String string : list) {
            store.getOrDefault(index, Collections.emptyList());
        }
    }

    public List<String> getValue(int index) {
        return null;
    }
}
