package ru.job4j.collection;

import ru.job4j.search.Task;

import java.util.HashSet;
import java.util.List;

public class FullSearch {
    public static HashSet<String> extractNumber(List<Task> list) {
        HashSet<String> numbers = new HashSet<>();
        for (Task task : list) {
        numbers.add(task.getNumber());
        }
        return numbers;
    }
}
