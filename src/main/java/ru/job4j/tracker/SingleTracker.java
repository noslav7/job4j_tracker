package ru.job4j.tracker;

public class SingleTracker {
    private Tracker tracker = new Tracker();



    public Item add(Item item) {
        return tracker.add(item);
    }

    public Item findById() {
        return null;
    }


}
