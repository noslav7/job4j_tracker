package ru.job4j.tracker;

import java.util.List;

public class ShowAction {
    private final Output out;

    public ShowAction(Output out) {
        this.out = out;
    }

        public String name() {
            return "Show all Items";
        }

        public boolean execute(Input input, MemTracker memTracker) {
            out.println("=== Show all items ====");
            List<Item> items = memTracker.findAll();
            if (items.size() > 0) {
                for (Item item : items) {
                    out.println(item);
                }
            } else {
                out.println("Хранилище еще не содержит заявок");
            }
            return true;
        }
    }
