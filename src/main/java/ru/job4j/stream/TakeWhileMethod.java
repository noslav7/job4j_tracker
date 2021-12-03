package ru.job4j.stream;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TakeWhileMethod {

    public static List<Integer> takeWhile(List<Integer> numbers) {
        return numbers.stream()
                .sorted()
                .takeWhile(e -> e < 0)
                .collect(Collectors.toList());
    }
}
