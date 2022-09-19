package ru.job4j.tracker;

import ru.job4j.tracker.model.Item;

import java.util.List;

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
        List<Item> findAll = store.findAll();
        for (Item item : findAll) {
            out.println(item);
        }
        return true;
    }
}
