package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.List;

public class MemTracker extends Item implements UserAction {
    private static final List<Item> items = new ArrayList<>();

    public static void main(String[] args) {
        UserAction user1 = new MemTracker();
        UserAction user2 = new MemTracker();
        items.add((Item) user1);
        items.add((Item) user2);
        items.remove(1);
        Item item = items.get(0);
    }

    public Item add(Item item) {
        items.add(item);
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

    @Override
    public String name() {
        return null;
    }

    @Override
    public boolean execute(Input input, Store tracker) {
        return false;
    }
}
