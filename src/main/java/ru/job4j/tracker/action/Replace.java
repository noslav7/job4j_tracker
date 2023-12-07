package ru.job4j.tracker.action;

import ru.job4j.tracker.input.Input;
import ru.job4j.tracker.Item;
import ru.job4j.tracker.output.Output;
import ru.job4j.tracker.store.Store;

public class Replace implements UserAction {
    private final Output out;

    public Replace(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Replace";
    }

    @Override
    public boolean execute(Input input, Store store) {
        out.println("=== Replace item ====");
        String name = input.askStr("Enter name: ");
        Item item = new Item(name);
        int cellNumber = input.askInt("Enter cell number to replace: ");
        store.replace(cellNumber, item);
        return true;
    }
}
