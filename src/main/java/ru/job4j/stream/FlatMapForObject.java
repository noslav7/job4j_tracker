package ru.job4j.stream;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapForObject {
    public static List<Integer> flatMap(List<List<Integer>> lists) {
        return lists.stream()
                .flatMap(subList -> subList.stream())
                .collect(Collectors.toList());
    }
}
