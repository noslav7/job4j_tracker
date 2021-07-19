package ru.job4j.tracker;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.lessThan;
import static org.junit.Assert.assertThat;

public class ItemSorterTest {

    @Test
    public void whenSortByIdDecrease() {
        List<Item> itemList = new ArrayList<Item>();
        itemList = List.of(
                new Item(0, "First item"),
                new Item(2, "Third item"),
                new Item(3, "Fourth item"),
                new Item(1, "Second item")
        );
        Collections.sort(itemList, new SortByIdDecrease());
        List<Item> expected = new ArrayList<Item>();
        expected = List.of(
                        new Item(3,"Fourth item"),
                        new Item(2, "Third item"),
                        new Item(1, "Second item"),
                        new Item(0, "First item")
        );
        List<Item>.compare(expected, itemList);
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