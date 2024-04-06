package ru.job4j.tracker.action;

import ru.job4j.tracker.input.Input;
import ru.job4j.tracker.store.Store;

import static java.lang.System.out;

public class Exit implements UserAction {

    public Exit() {
    }

    @Override
    public String name() {
        return "Exit";
    }

    @Override
    public boolean execute(Input input, Store store) {
        out.println("=== Exit program ====");
        return false;
    }
}
