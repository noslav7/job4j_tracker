package ru.job4j.tracker;

import com.sun.jdi.connect.Connector;

public class SingleTracker {
    private Tracker tracker = new Tracker();
    private static Tracker instance = null;

    public Tracker getInstance() {
        if (tracker == null) {
            tracker = new Tracker();
        }
        return tracker;
    }

    public Item add(Item item) {
        return tracker.add(item);
    }

    public Item findById() { return tracker.findById(findById().getId());
    }

    public Item[] findByName(String key) { return tracker.findByName(findById().getName()); }

    public boolean replace(int id, Item item) { return tracker.replace(findById().getId(), item); }

    public boolean delete(int id) { return tracker.delete(findById().getId()); }

}
