package ru.job4j.tracker;

import java.util.List;

public class StartUI {

    private final Output out;

    public StartUI(Output out) {
        this.out = out;
    }

    public void init(Input input, Store store, List<UserAction> items) {
        boolean run = true;
        while (run) {
            this.showMenu(items.toArray(new UserAction[0]));
            int select = input.askInt("Select: ");
            if (select < 0 || select >= items.size()) {
                out.println("Wrong input, you can select: 0 .. " + (items.size() - 1));
                continue;
            }
            UserAction action = items.get(select);
            run = action.execute(input, store);
        }
    }

    private void showMenu(UserAction[] actions) {
        out.println("Menu:");
        for (int index = 0; index < actions.length; index++) {
            out.println(index + ". " + actions[index].name());
        }
    }

    public static void main(String[] args) {
        Output output = new ConsoleOutput();
        Input input = new ValidateInput(output,
                new ConsoleInput()
        );
        Store tracker = new MemTracker();
        List<UserAction> actions = List.of(
                new CreateAction(output),
                new ReplaceAction(output),
                new DeleteAction(output),
                new FindAllAction(output),
                new FindByIdAction(output),
                new FindByNameAction(output),
                new ExitAction(),
                new CreateManyItems(output),
                new DeleteAllItems(output)
        );
        new StartUI(output).init(input, tracker, actions);
    }
}