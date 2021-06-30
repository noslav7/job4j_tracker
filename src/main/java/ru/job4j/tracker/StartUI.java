package ru.job4j.tracker;

import java.lang.reflect.Array;
import java.util.Scanner;


public class  StartUI {
    private static String msg = "Enter Id";

    public static void createItem(Input input, Tracker tracker) {
        System.out.println("=== Create a New Item ====");
        System.out.println("Enter name: ");
        String msg = "Enter Id: ";
        String name = input.askStr(msg);
        Item item = new Item(name);
        tracker.add(item);
        System.out.println("Добавленная заявка" + item);
    }

    public static void showItems(Input input, Tracker tracker) {
        System.out.println("=== Show all items ====");
        Item[] items = tracker.findAll();
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
        int id = Integer.parseInt(input.askStr(msg));
        System.out.println("Enter name: ");
        String name = input.askStr(msg);
        Item item = new Item(name);
        if (tracker.replace(id, item)) {
            System.out.println("Заявка заменена успешно.");
        } else {
            System.out.println("Ошибка замены заявки.");
        }
    }

    public static void enterId(Input input, Tracker tracker) {
        System.out.println("=== Delete item ====");
        System.out.println("Enter Id: ");
        int id = Integer.parseInt(input.askStr(msg));
        if (tracker.delete(id)) {
            System.out.println("Заявка удалена успешно.");
        } else {
            System.out.println("Ошибка удаления заявки.");
        }
    }

    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            showMenu();
            System.out.println("Select: ");
            int select = Integer.parseInt(input.askStr(msg));
            if (select == 0) {
                StartUI.createItem(input, tracker);
            } else if (select == 1) {
                StartUI.showItems(input, tracker);
            } else if (select == 2) {
                StartUI.editItem(input, tracker);
            } else if (select == 3) {
                StartUI.enterId(input, tracker);
            } else if (select == 6) {
                run = false;
            }
        }
    }
    private void showMenu () {
        String[] menu = {
                "Add New Item", "Show All Items", "Edit Item",
                "Delete Item", "Find Item by Id", "Find Items by Name",
                "Exit Program"
        };
        System.out.println("Menu:");
        for (int i = 0; i < menu.length; i++) {
            System.out.println(i + ". " + menu[i]);
        }
    }
    public static void main (String[]args){
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUI().init(input, tracker);
    }
 }
