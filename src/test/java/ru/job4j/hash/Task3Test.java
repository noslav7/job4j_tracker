package ru.job4j.hash;

import org.junit.Ignore;
import org.junit.Test;
import java.util.List;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.jupiter.api.Assertions.*;

public class Task3Test {

    @Ignore
    @Test
    public void whenNoDuplicate() {
        var right = List.of(1, 2, 3);
        var left = List.of(4, 5, 6);
        var expected = List.of();
        var result = Task3.extractDuplicates(left, right);
        assertEquals(result, is(expected));
    }

    @Ignore
    @Test
    public void whenFullDuplicate() {
        var right = List.of(1, 2, 3);
        var left = List.of(1, 2, 3);
        var expected = List.of(1, 2, 3);
        var result = Task3.extractDuplicates(left, right);
        assertEquals(result, is(expected));
    }

    @Ignore
    @Test
    public void whenLeftDuplicate() {
        var right = List.of(1, 2, 3);
        var left = List.of(1, 2, 3, 4, 5, 6);
        var expected = List.of(1, 2, 3);
        var result = Task3.extractDuplicates(left, right);
        assertEquals(result, is(expected));
    }

    @Ignore
    @Test
    public void whenRightDuplicate() {
        var right = List.of(1, 2, 3, 4, 5, 6);
        var left = List.of(1, 2, 3);
        var expected = List.of(1, 2, 3);
        var result = Task3.extractDuplicates(left, right);
        assertEquals(result, is(expected));
    }
}