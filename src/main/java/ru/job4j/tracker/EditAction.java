package ru.job4j.tracker;

import ru.job4j.tracker.model.Item;

public class EditAction {
    private final Output out;

    public EditAction(Output out) {
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
