package ru.job4j.lambda;

import java.util.Optional;

public class OptionalIfPresent {

    public static void ifPresent(int[] data) {
        max(data).ifPresent(x -> System.out.println("Max: " + x));
    }

    private static Optional<Integer> max(int[] data) {
        int max = 0;
        Optional<Integer> optional = Optional.empty();
        if (data.length != 0) {
            for (int datum : data) {
                if (datum > max) {
                    max = datum;
                }
            }
        optional = Optional.of(max);
        }
        return optional;
    }
}
