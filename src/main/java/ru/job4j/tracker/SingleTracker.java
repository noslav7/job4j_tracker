package ru.job4j.tracker;

public class SingleTracker {
    private Tracker tracker = new Tracker();

    private SingleTracker() {
    }

    public Tracker getInstance() {
        if (tracker == null) {
            tracker = new Tracker();
        }
        return tracker;
    }

    public Item add(Item item) {
        return tracker.add(item);
    }

    public Item findById(int id) {
        return tracker.findById(id);
    }

    public Item[] findByName(String key) { return tracker.findByName(key); }

    public boolean replace(int id, Item item) { return tracker.replace(id, item); }

    public boolean delete(int id) { return tracker.delete(id); }

}
