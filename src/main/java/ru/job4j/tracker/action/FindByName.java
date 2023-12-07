package ru.job4j.tracker.action;

import ru.job4j.tracker.input.Input;
import ru.job4j.tracker.Item;
import ru.job4j.tracker.output.Output;
import ru.job4j.tracker.store.Store;

import java.util.List;

public class FindByName implements UserAction {
    private final Output out;

    public FindByName(Output out) {
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
        List<Item> findName = store.findByName(name);
        if (findName.size() > 0) {
            for (Item itemFindName : findName) {
                out.println(itemFindName);
            }
        } else {
            out.println("Заявка с таким id не найдена");
        }
        return true;
    }
}
