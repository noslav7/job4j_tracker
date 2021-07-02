package ru.job4j.tracker;

public class ShowAction implements UserAction {
    private final Output out;

    public ShowAction(Output out) {
        this.out = out;
    }

        @Override
        public String name () {
            return "Show items";
        }

        @Override
        public boolean execute (Input input, Tracker tracker){
            out.println("=== Show items ====");
            String name = input.askStr("Enter name: ");
            Item item = new Item(name);
            Item[] items = tracker.findAll();
            if (items.length > 0) {
                for (int i = 0; i < items.length; i++) {
                    out.println(item);
                }
            } else {
                out.println("Хранилище еще не содержит заявок");
            }
            return true;
        }
    }
