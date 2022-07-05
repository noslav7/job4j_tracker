package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.List;
import ru.job4j.tracker.model.Item;

public class MemTracker implements Store {
    private static List<Item> items = new ArrayList<>();
    private int ids = 1;

    public static void main(String[] args) {
        Store user1 = new MemTracker();
        Store user2 = new MemTracker();
        items.add((Item) user1);
        items.add((Item) user2);
        items.remove(1);
        Item item = items.get(0);
    }

    public Item add(Item item) {
        items.add(item);
        item.setId(ids++);
        return item;
    }

    public Item findById(int id) {
        int index = indexOf(id);
        return index != -1 ? items.get(index) : null;
    }

    public List<Item> findByName(String key) {
        List<Item> rsl = new ArrayList<>();
        for (Item item : items) {
            if (key.equals(item.getName())) {
                rsl.add(item);
            }
        }
        return rsl;
     }

    public List<Item> findAll() {
        return new ArrayList<>(items);
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
            items.remove(index);
        }
        return result;
    }
}
