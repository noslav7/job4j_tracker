package ru.job4j.tracker;

public class ShowAction implements UserAction{
    @Override
    public String name() {
        return "Show items";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Show items ====");
        String name = input.askStr("Enter name: ");
        Item item = new Item(name);
        tracker.add(item);
        Item[] items = tracker.findAll();
        if (items.length > 0) {
            for (int i = 0; i < items.length; i++) {
                System.out.println(item);
            }
        } else {
            System.out.println("Хранилище еще не содержит заявок");
        }
        return true;
    }
}
