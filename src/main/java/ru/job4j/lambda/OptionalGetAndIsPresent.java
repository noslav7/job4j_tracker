package ru.job4j.lambda;

import java.util.Optional;

public class OptionalGetAndIsPresent {
    public static int get(int[] data, int el) {
        int index = 0;
        if (indexOf(data, el).equals(Optional.empty())) {
            index = -1;
        }
        if (Optional.of(el).isPresent()) {
        index = indexOf(data, el).get();
        }
        return index;
    }

    private static Optional<Integer> indexOf(int[] data, int el) {
        Optional<Integer> optional = Optional.empty();
        for (int i = 0; i < data.length; i++) {
            if (data[i] == el) {
                optional = Optional.of(i);
            }
        }
    return optional;
    }
}
