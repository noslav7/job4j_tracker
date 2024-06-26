package ru.job4j.tracker.store;

import ru.job4j.tracker.Item;

import java.util.ArrayList;
import java.util.List;

public class MemTracker implements Store {
    private static List<Item> items = new ArrayList<>();
    private int ids = 1;

    public static void main(String[] args) {
        Item user1 = new Item();
        Item user2 = new Item();
        items.add(user1);
        items.add(user2);
        items.remove(1);
        Item item = items.get(0);
    }

    public Item add(Item item) {
        items.add(item);
        item.setId(ids++);
        return item;
    }

    public Item findById(Integer id) {
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

    public boolean replace(Integer id, Item item) {
        int index = indexOf(id);
        boolean rsl = index != -1;
        if (rsl) {
            item.setId(id);
            items.set(index, item);
        }
        return rsl;
    }

    public boolean delete(Integer id) {
        int index = indexOf(id);
        boolean result = index != -1;
        if (result) {
            items.remove(index);
        }
        return result;
    }
}
