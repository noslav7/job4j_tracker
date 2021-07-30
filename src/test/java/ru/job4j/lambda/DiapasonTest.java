package ru.job4j.lambda;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class DiapasonTest {

    @Test
    public void whenLinearFunctionThenLinearResults() {
        List<Double> result = Diapason.diapason(6, 8, x -> 5 * x);
        List<Double> expected = Arrays.asList(30D, 35D, 40D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenSquareFunctionThenSquareResults() {
        List<Double> result = Diapason.diapason(1, 4, x -> 2 * x * x);
        List<Double> expected = Arrays.asList(2D, 8D, 18D, 32D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenExponentialFunctionThenExponentialResults() {
        List<Double> result = Diapason.diapason(2, 6, x -> Math.pow(2, x));
        List<Double> expected = Arrays.asList(4D, 8D, 16D, 32D, 64D);
        assertThat(result, is(expected));
    }
}