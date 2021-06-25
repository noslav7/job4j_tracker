package ru.job4j.tracker;
import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;

    public Item add(Item item) {
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

    public Item[] findByName(int siz) {
        Item[] namesWithoutNull = new Item[items.length];
        for (int i  = 0; i < siz; i++) {
            String name = items[i].getName();
            if (name.equals(siz)) {
                namesWithoutNull[siz] = items[i];
                siz++;
            }
        }
        namesWithoutNull = Arrays.copyOf(namesWithoutNull, siz);
        return namesWithoutNull;
    }

    public Item[] findAll() {
        return Arrays.copyOf(items, items.length);
    }
}
