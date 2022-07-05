package ru.job4j.tracker;

import ru.job4j.tracker.model.Item;

public class FindByNameAction implements UserAction {
    private final Output out;

    public FindByNameAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "FindByName";
    }

    @Override
    public boolean execute(Input input, Store store) {
        out.println("=== Create a new item ====");
        String name = input.askStr("Enter name: ");
        Item item = new Item(name);
        store.add(item);
        return true;
    }
}
