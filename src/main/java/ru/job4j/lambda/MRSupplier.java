package ru.job4j.lambda;

import java.util.function.Supplier;

public class MRSupplier {
    public static Supplier<String> supplier() {
        Supplier<String> supplier = new Supplier<String>() {
            @Override
            public String get() {
                return "";
            }
        };
        return supplier;
    }
}
