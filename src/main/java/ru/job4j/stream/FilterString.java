package ru.job4j.stream;
import java.util.List;
import java.util.stream.Collectors;

public class FilterString {

    public static List<String> filter(List<String> data) {
        return data.stream()
                .filter(e -> e.startsWith("A"))
                .filter(e -> e.endsWith(".java"))
                .collect(Collectors.toList());
    }
}
