package ru.job4j.tracker;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ItemSorter {
    public static void main(String[] args) {
        List<Item> items = Arrays.asList(
                new Item(0, "First item"),
                new Item(1, "Second item"),
                new Item(2, "Third item")
        );
        System.out.println(items);
        Collections.sort(items);
        System.out.println(items);
    }
}