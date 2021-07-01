package ru.job4j.tracker;

import java.lang.reflect.Array;
import java.util.Scanner;


public class  StartUI {


    public static void createItem(Input input, Tracker tracker) {
        System.out.println("=== Create a New Item ====");
        System.out.println("Enter name: ");
        String msg = "Enter Id: ";
        String name = input.askStr("Enter name: ");
        Item item = new Item(name);
        tracker.add(item);
        System.out.println("Добавленная заявка" + item);
    }

    public static void showItems(Input input, Tracker tracker) {
        System.out.println("=== Show all items ====");
        Item[] items = tracker.findAll();
        String name = input.askStr("Enter name: ");
        if (items.length > 0) {
            for (Item item : items) {
                System.out.println(item);
            }
        } else {
            System.out.println("Хранилище еще не содержит заявок");
        }
    }

    public static void editItem(Input input, Tracker tracker) {
        System.out.println("=== Edit item ====");
        System.out.println("Enter Id: ");
        int id = input.askInt("Enter Id: ");
        System.out.println("Enter name: ");
        String name = input.askStr("Enter name: ");
        Item item = new Item(name);
        if (tracker.replace(id, item)) {
            System.out.println("Заявка заменена успешно.");
        } else {
            System.out.println("Ошибка замены заявки.");
        }
    }

    public static void deleteItem(Input input, Tracker tracker) {
        System.out.println("=== Delete item ====");
        System.out.println("Enter Id: ");
        int id = Integer.parseInt(input.askStr("Enter name: "));
        if (tracker.delete(id)) {
            System.out.println("Заявка удалена успешно.");
        } else {
            System.out.println("Ошибка удаления заявки.");
        }
    }

    public static void findById(Input input, Tracker tracker) {
        System.out.println("=== Find item by id ====");
        System.out.print("Enter id: ");
        int id = Integer.parseInt(input.askStr("Enter name: "));
        Item item = tracker.findById(id);
        if (item != null) {
            System.out.println(item);
        } else {
            System.out.println("Заявка с введенным id: " + id + " не найдена.");
        }
    }

    public static void findByName(Input input, Tracker tracker) {
        System.out.println("=== Find items by name ====");
        System.out.print("Enter name: ");
        String name = input.askStr("Enter name: ");
        Item[] items = tracker.findByName(name);
        if (items.length > 0) {
            for (Item item : items) {
                System.out.println(item);
            }
        } else {
            System.out.println("Заявки с именем: " + name + " не найдены.");
        }
    }

    public static void replaceItem(Input input, Tracker tracker) {
        System.out.println(" === Update item ====");
        int id = input.askInt("Enter id:");
        String name = input.askStr("Enter a new name of item: ");
        Item item = new Item(name);
        item.setId(id);
        tracker.replace(id, item);
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
        System.out.println("Menu:");
        for (int index = 0; index < actions.length; index++) {
            System.out.println(index + ". " + actions[index].name());
        }
    }

    public static void main (String[]args){
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new CreateAction()
        };
        new StartUI().init(input, tracker, actions);
    }
 }
