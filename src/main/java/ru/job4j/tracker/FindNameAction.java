package ru.job4j.tracker;

import ru.job4j.tracker.model.Item;

import java.util.List;

public class FindNameAction {
    private final Output out;

    public  FindNameAction(Output out) {
        this.out = out;
    }

    public String name() {
        return "Find item by name";
    }

    public boolean execute(Input input, MemTracker memTracker) {
        out.println("=== Find items by name ====");
        String name = input.askStr("Enter name: ");
        List<Item> items = memTracker.findAll();
        if (items.size() > 0) {
            for (Item item : items) {
                out.println(item);
            }
        } else {
            out.println("Заявки с именем: " + name + " не найдены.");
        }
        return true;
    }
}
