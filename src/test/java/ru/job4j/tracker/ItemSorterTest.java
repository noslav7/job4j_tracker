package ru.job4j.tracker;

import org.junit.Test;

import java.util.*;

import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.lessThan;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class ItemSorterTest {

    @Test
    public void whenSortByIdDec() {
        List<Item> itemList = Arrays.asList(
                new Item(0, "First item"),
                new Item(2, "Third item"),
                new Item(3, "Fourth item"),
                new Item(1, "Second item")
        );
        Collections.sort(itemList, new SortByIdDescending());
        List<Item> expected = List.of(
                        new Item(3,"Fourth item"),
                        new Item(2, "Third item"),
                        new Item(1, "Second item"),
                        new Item(0, "First item")
        );
        assertEquals(expected, itemList);
    }

    @Test
    public void whenSortByIdAsc() {
        List<Item> itemList = Arrays.asList(
                new Item(0, "First item"),
                new Item(2, "Third item"),
                new Item(3, "Fourth item"),
                new Item(1, "Second item")
        );
        Collections.sort(itemList, new SortByIdAscending());
        List<Item> expected = List.of(
                new Item(0, "First item"),
                new Item(1, "Second item"),
                new Item(2, "Third item"),
                new Item(3,"Fourth item")
        );
        assertEquals(expected, itemList);
    }

}