package ru.job4j.stream;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMap {
    Integer[][] array = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
    };

    public List<Integer> flatMap(Integer[][] array) {
        return Stream.of(array).flatMap(Arrays::stream).collect(Collectors.toList());
    }
}
