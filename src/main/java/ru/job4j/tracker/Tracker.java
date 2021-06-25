package ru.job4j.tracker;
import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;

    public Item add(Item item) {
        items.add(item);
        item.setId(ids++);
        return item;
    }

    public Item findById(int id) {
        Item rsl = null;
        for (int index = 0; index < items.length - 1; index++) {
            Item item = items[index];
            if (item.getId() == id) {
                rsl = item;
                break;
            }
        }
        return rsl;
    }

    public Item[] findByName(String key) {
        Item[] namesWithoutNull = new Item[items.length];
        int count = 0;
        for (int i  = 0; i < items.length - 1; i++) {
            String name = items[i].getName();
            if (name.equals(key)) {
                namesWithoutNull[count] = items[i];
                count++;
            }
        }
        namesWithoutNull = Arrays.copyOf(namesWithoutNull, count);
        return namesWithoutNull;
    }

    public Item[] findAll() {
        return Arrays.copyOf(items, items.length);
    }
}
