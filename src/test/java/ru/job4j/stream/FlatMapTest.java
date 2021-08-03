package ru.job4j.stream;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class  FlatMapTest {

    @Test
    public void whenFlatMap() {
        Integer[][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        FlatMap fm = new FlatMap();
        List<Integer> result = fm.flatMap(array);
        List<Integer> expected = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        assertThat(result, is(expected));
    }
}