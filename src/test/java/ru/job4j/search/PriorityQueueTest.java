package ru.job4j.search;

import org.junit.Test;
import ru.job4j.collection.Person;

import java.util.ArrayList;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class PriorityQueueTest {

    @Test
    public void whenHigherPriority() {
        var queue = new PriorityQueue();
        queue.put(new Task(5, "low"));
        queue.put(new Task(1, "urgent"));
        queue.put(new Task(3, "middle"));
        var result = queue.take();
        assertThat(result.getDescription(), is("urgent"));

    }
}