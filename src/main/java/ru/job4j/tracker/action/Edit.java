package ru.job4j.tracker.action;

import ru.job4j.tracker.input.Input;
import ru.job4j.tracker.Item;
import ru.job4j.tracker.store.MemTracker;
import ru.job4j.tracker.output.Output;

public class Edit {
    private final Output out;

    public Edit(Output out) {
        this.out = out;
    }

    public String name() {
        return "Edit item";
    }

    public boolean execute(Input input, MemTracker memTracker) {
        out.println("=== Edit item ====");
        int id = input.askInt("Enter Id: ");
        String name = input.askStr("Enter name: ");
        Item item = new Item(name);
        if (memTracker.replace(id, item)) {
            out.println("Заявка заменена успешно.");
        } else {
            out.println("Ошибка замены заявки.");
        }
        return true;
    }
}
