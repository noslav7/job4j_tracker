package ru.job4j.tracker;

import ru.job4j.tracker.action.*;
import ru.job4j.tracker.action.Exit;
import ru.job4j.tracker.input.ConsoleInput;
import ru.job4j.tracker.output.ConsoleOutput;
import ru.job4j.tracker.input.Input;
import ru.job4j.tracker.input.ValidateInput;
import ru.job4j.tracker.output.Output;
import ru.job4j.tracker.store.MemTracker;
import ru.job4j.tracker.store.Store;

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
                new Create(output),
                new Replace(output),
                new Delete(output),
                new FindAll(output),
                new FindById(output),
                new FindByName(output),
                new Exit(),
                new CreateManyItems(output),
                new DeleteAllItems(output)
        );
        new StartUI(output).init(input, tracker, actions);
    }
}