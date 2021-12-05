package ru.job4j.stream;

import java.util.List;
import java.util.Optional;

public class OptionalFlatMap {
  public static Optional<Integer> flatMap(List<String> strings) {
        return strings.stream()
                .filter(e -> e.endsWith(".java"))
                .map(String::length)
                .findFirst();
    }
}
