package ru.job4j.tracker;

import java.util.List;

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
