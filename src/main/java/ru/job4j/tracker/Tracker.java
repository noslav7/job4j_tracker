package ru.job4j.tracker;
import java.util.Arrays;

public class Tracker {
    private ListItem[] items = new ListItem[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = (ListItem) item;
        return item;
    }

    public Item findById(int id) {
        int index = indexOf(id);
        return index != -1 ? (Item) items[index] : null;
    }

    public Item[] findByName(String key) {
        Item[] namesWithoutNull = new Item[items.length];
        int size = 0;
        for (int index = 0; index < this.size; index++) {
            String name = items[index].getName();
            if (name.equals(key)) {
                namesWithoutNull[size] = (Item) items[index];
                size++;
            }
        }
        namesWithoutNull = Arrays.copyOf(namesWithoutNull, size);
        return namesWithoutNull;
    }

    public Item[] findAll() {
        return (Item[]) Arrays.copyOf(items, size);
    }

    private int indexOf(int id) {
        int rsl = -1;
        for (int index = 0; index < size; index++) {
            if (items[index].getId() == id) {
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
            items[index] = (ListItem) item;
        }
        return rsl;
    }

    public boolean delete(int id) {
        int index = indexOf(id);
        boolean result = index != -1;
        if (result) {
            System.arraycopy(items, index + 1, items, index, size - index - 1);
            items[size - 1] = null;
            size--;
        }
        return result;
    }
}
