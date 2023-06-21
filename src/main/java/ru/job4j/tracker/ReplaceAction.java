package ru.job4j.tracker;

public class ReplaceAction implements UserAction {
    private final Output out;

    public ReplaceAction(Output out) {
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
