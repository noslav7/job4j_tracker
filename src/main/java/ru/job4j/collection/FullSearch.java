package ru.job4j.collection;

import ru.job4j.search.Task;

import java.util.HashSet;
import java.util.List;

public class FullSearch {
    public static HashSet<Integer> extractNumber(List<Task> list) {
        HashSet<Integer> numbers = new HashSet<>();
        for (var task : list) {
        numbers.add(task.getNumber());
        }
        return numbers;
    }
}
