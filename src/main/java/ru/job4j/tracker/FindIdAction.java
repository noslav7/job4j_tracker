package ru.job4j.tracker;

public class FindIdAction implements UserAction {

    @Override
    public String name() {
        return "Find item by Id";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Find item by id ====");
        System.out.print("Enter id: ");
        int id = input.askInt("Enter Id: ");
        Item item = tracker.findById(id);
        return true;
    }
}
