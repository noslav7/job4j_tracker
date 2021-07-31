package ru.job4j.lambda;

import java.util.List;
import java.util.Optional;

public class OptionalOfAndEmpty {
    public static Optional<String> findValue(List<String> strings, String value) {
        Optional<String> word = Optional.empty();
        for (int i = 0; i < strings.size(); i++) {
            if (strings.get(i).equals(value)) {
                word = Optional.of(strings.get(i));
            }
        }
        return word;
    }
}
