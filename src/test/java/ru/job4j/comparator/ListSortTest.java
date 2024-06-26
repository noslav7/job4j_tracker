package ru.job4j.comparator;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ListSortTest {

    @Test
    public void test() {
        List<String> input = Arrays.asList(null, "a", "b", "c");
        List<String> result = ListSort.sort(input);
        List<String> expect = Arrays.asList("c", "b", "a", null);
        assertEquals(expect, result);
    }

}