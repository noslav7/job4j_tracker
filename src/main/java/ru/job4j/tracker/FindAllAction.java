package ru.job4j.tracker;

import ru.job4j.tracker.model.Item;

public class FindAllAction implements UserAction {

    private final Output out;

    public FindAllAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "FindAll";
    }

    @Override
    public boolean execute(Input input, Store store) {
        out.println("=== Find all elements ====");
        String name = input.askStr("Enter name: ");
        Item item = new Item(name);
        store.add(item);
        return true;
    }
}
