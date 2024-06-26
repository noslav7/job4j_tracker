package ru.job4j.tracker.action;

import ru.job4j.tracker.input.Input;
import ru.job4j.tracker.Item;
import ru.job4j.tracker.store.MemTracker;
import ru.job4j.tracker.output.Output;

import java.util.List;

public class Show {
    private final Output out;

    public Show(Output out) {
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
