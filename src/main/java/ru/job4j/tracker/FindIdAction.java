package ru.job4j.tracker;

public class FindIdAction implements UserAction {

    private final Output out;

    public FindIdAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Find item by Id";
    }

    @Override
    public boolean execute(Input input, Store store) {
        out.println("=== Find item by id ====");
        int id = input.askInt("Enter Id: ");
        Item item = store.findById(id);
        if (item != null) {
            out.println(item);
        } else {
            out.println("Заявка с введенным id: " + id + " не найдена.");
        }
        return true;
    }
}
