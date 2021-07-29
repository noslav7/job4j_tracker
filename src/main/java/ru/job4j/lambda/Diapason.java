package ru.job4j.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Diapason {

    List<Double> diapason(int start, int end, Function<Double, Double> func) {
        List<Double> results = new ArrayList<>();
        Function<Double, Double> linear = s -> s;
        results.add(linear.apply((double) start));
        Function<Double, Double> square = s -> s * s;
        results.add(square.apply((double) start * start));
        Function<Double, Double> exponential = s -> Math.pow(start, s);
        results.add(exponential.apply((double) (start ^ end)));
    return results;
    }
}

