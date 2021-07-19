package ru.job4j.tracker;

import org.junit.Test;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.lessThan;
import static org.junit.Assert.assertThat;

public class ItemSorterTest {

    @Test
    public void whenSortByIdDecrease() {
        List<Item> itemList = new List<Item>() {
                new Item(0, "First item"),
                new Item(2, "Third item"),
                new Item(3, "Fourth item"),
                new Item(1, "Second item")
        };
        Collections.sort(itemList, new SortByIdDecrease());
        List<Item> expected = new List<Item>() {
                        Item(3,"Fourth item"),
                        Item(2, "Third item"),
                        Item(1, "Second item"),
                        Item(0, "First item")
        };
        assertThat(expected, itemList);
    }
}