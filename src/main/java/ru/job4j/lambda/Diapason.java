package ru.job4j.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Diapason {

    List<Double> diapason(int start, int end, Function<Double, Double> func) {
        List<Double> results = new ArrayList<>();
        results.add(func.apply((double) start));
        results.add(func.apply((double) start * start));
        results.add(func.apply((double) (start ^ end)));
    return results;
    }
}

