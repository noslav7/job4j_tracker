package ru.job4j.collection;

import org.junit.Test;
import ru.job4j.search.Task;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FullSearchTest {

    @Test
    public void extractNumber() {
       var tasks = List.of(
                new Task(1, "First desc"),
                new Task(2, "Second desc"),
                new Task(1, "First desc")
        );
        var expected = new HashSet<>(List.of("1", "2"));
        assertThat(FullSearch.extractNumber(tasks), is(expected));
    }

}