package ru.job4j.lambda;

import org.junit.Test;
import ru.job4j.function.Folder;
import ru.job4j.function.SearchFolder;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class DiapasonTest {

    @Test
    public void whenSquareFunctionThenSquareResults() {
        List<Double> result = Diapason.diapason(1, 4, x -> x * x);
        List<Double> expected = Arrays.asList(1D, 4D, 9D, 16D);
        assertThat(result, is(expected));
    }



}