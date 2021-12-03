package ru.job4j.stream;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class DropWhileMethod {

    public static List<Integer> dropWhile(List<Integer> numbers) {
        return numbers.stream()
                .sorted()
                .dropWhile(e -> e <= 0)
                .collect(Collectors.toList());
    }
}
