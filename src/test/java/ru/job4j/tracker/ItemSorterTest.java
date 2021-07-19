package ru.job4j.tracker;

import org.junit.Test;

import java.util.Comparator;

import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.lessThan;
import static org.junit.Assert.assertThat;

public class ItemSorterTest {

    @Test
    public void whenSortByIdDecrease() {
        Comparator<Item> cmpName = new SortByIdDecrease();
        int rsl = cmpName.compare(
                new Item(1, "First item"),
                new Item(0, "Second item")
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenCompatorByPriorityDesc() {
        Comparator<Item> cmpName = new SortByIdIncrease();
        int rsl = cmpName.compare(
                new Item(1, "First item"),
                new Item(0, "Second item")
        );
        assertThat(rsl, greaterThan(0));
    }

}