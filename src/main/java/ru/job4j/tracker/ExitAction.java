package ru.job4j.tracker;

import ru.job4j.tracker.model.Item;

import static java.lang.System.out;

public class ExitAction implements UserAction {

    public ExitAction() {
    }

    @Override
    public String name() {
        return "Exit";
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
