package ru.job4j.comparator;

import java.util.Comparator;

public class NullLastMethod {
    public static Comparator<String> nullLast() {
        String string = "AmanKajalJoyitaDas";
        Comparator<String> comparator = Comparator.nullsLast(Comparator.naturalOrder());
        return comparator;
    }
}
