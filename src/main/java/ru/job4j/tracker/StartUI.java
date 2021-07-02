package ru.job4j.tracker;


public class  StartUI implements Output {
    private final Output out;

    public StartUI(Output out) {
        this.out = out;
    }

    public void init(Input input, Tracker tracker, UserAction[] actions) {
        boolean run = true;
        while (run) {
            this.showMenu(actions);
            int select = input.askInt("Select: ");
            UserAction action = actions[select];
            run = action.execute(input, tracker);
        }
    }

    private void showMenu (UserAction[] actions) {
        println("Menu:");
        for (int index = 0; index < actions.length; index++) {
            println(index + ". " + actions[index].name());
        }
    }

    public static void main (String[]args){
        Output output = new ConsoleOutput();
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new CreateAction(output),
                new ShowAction(output),
                new EditAction(output),
                new DeleteAction(output),
                new FindIdAction(output),
                new FindNameAction(output),
                new Exit(output)
        };
        new StartUI(output).init(input, tracker, actions);
    }

    @Override
    public void println(Object obj) {
    }
}
