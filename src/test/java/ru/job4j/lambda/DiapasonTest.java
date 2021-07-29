package ru.job4j.lambda;

import org.junit.Test;
import ru.job4j.function.Folder;
import ru.job4j.function.SearchFolder;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class DiapasonTest {

    @Test
    public void whenDiapasonSmall() {
        int start = 1;
        int end = 3;
        double expected = Math.pow(3, 1);
        Function<Double, Double> exponential = f -> Math.pow(end, start);
        double outcome = exponential.apply();
        assertThat(outcome, is(expected));
    }

}