package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tracker {
    private final List<Item> items = new ArrayList<>();
    private int ids = 1;

    public Item add(Item item) {
        item.setId(ids++);
        items.add(item);
        return item;
    }

    public Item findById(int id) {
        int index = indexOf(id);
        return index != -1 ? (Item) items.get(index) : null;
    }

    public List<Item> findByName(String key) {
        Item[] namesWithoutNull = new Item[items.size()];
        int size = 0;
        for (int index = 0; index < items.size(); index++) {
            String name = items.get(index).getName();
            if (name.equals(key)) {
                namesWithoutNull[size] = (Item) items.get(index);
                size++;
            }
        }
        namesWithoutNull = Arrays.copyOf(namesWithoutNull, size);
        return List<Item>;
    }

    public Item[] findAll() {
        return List<Item>;
    }

    private int indexOf(int id) {
        int rsl = -1;
        for (int index = 0; index < items.size(); index++) {
            if (items.get(index).getId() == id) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    public boolean replace(int id, Item item) {
        int index = indexOf(id);
        boolean rsl = index != -1;
        if (rsl) {
            item.setId(id);
            items.set(index, item);
        }
        return rsl;
    }

    public boolean delete(int id) {
        int index = indexOf(id);
        boolean result = index != -1;
        if (result) {
            items.remove(items);
        }
        return result;
    }
}
