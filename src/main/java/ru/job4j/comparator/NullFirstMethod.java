package ru.job4j.comparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class NullFirstMethod {
    public static Comparator<String> nullFirst() {
        String string = "AmanKajalJoyitaDas";
        Comparator<String> comparator = Comparator.nullsFirst(Comparator.naturalOrder());
        return comparator;
    }
}
