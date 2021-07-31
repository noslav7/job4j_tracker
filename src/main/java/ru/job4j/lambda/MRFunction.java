package ru.job4j.lambda;

import java.util.function.Function;

public class MRFunction {

    public static Function<Double, Double> apply() {
        Function<Double, Double> mrf = (s) -> Math.sqrt(s);
        return mrf;
    }
}
