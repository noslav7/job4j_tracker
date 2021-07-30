package ru.job4j.lambda;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class DiapasonTest {

    @Test
    public void whenLinearFunctionThenLinearResults() {
        List<Double> result = Diapason.diapason(6, 8, x -> 5 * x + 3);
        List<Double> expected = Arrays.asList(33D, 38D, 43D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenSquareFunctionThenSquareResults() {
        List<Double> result = Diapason.diapason(1, 4, x -> 2 * x * x + 4);
        List<Double> expected = Arrays.asList(6D, 12D, 22D, 36D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenExponentialFunctionThenExponentialResults() {
        List<Double> result = Diapason.diapason(2, 6, x -> Math.pow(2, x) + 5);
        List<Double> expected = Arrays.asList(9D, 13D, 21D, 37D, 69D);
        assertThat(result, is(expected));
    }
}