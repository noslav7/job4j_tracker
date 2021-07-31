package ru.job4j.lambda;

import java.util.Optional;

public class OptionalGetAndIsPresent {
    public static int get(int[] data, int el) {
        int index = 0;
        for (int i = 0; i < data.length; i++) {
            if (OptionalGetAndIsPresent.indexOf(data, i).equals(Optional.empty())) {
                index = -1;
            } else {
                index = indexOf(data, el).get();
            }
        }
        return index;
    }

    private static Optional<Integer> indexOf(int[] data, int el) {
        Optional<Integer> optional = Optional.empty();
        for (int i = 0; i < data.length; i++) {
            if (data[i] == el) {
                optional = indexOf(data, el);
            }
        }
    return optional;
    }
}
