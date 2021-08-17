package ru.job4j.lambda;

import java.util.Optional;

public class OptionalOrlElse {

    public static Integer orElse(Optional<Integer> optional) {
        return optional.orElseGet(() -> -1);
    }
}
