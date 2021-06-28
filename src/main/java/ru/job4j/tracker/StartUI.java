package ru.job4j.tracker;

import java.lang.reflect.Array;
import java.util.Scanner;

public class  StartUI {
    public void init(Scanner scanner, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            System.out.println("Select:");
            int select = Integer.valueOf(scanner.nextLine());
            if (select == 0) {
                System.out.println("=== Create a new Item ====");
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                Item item = new Item(name);
                tracker.add(item);
            } else if (select == 1) {
                System.out.println("=== Show all Items ====");
            Item[] items = tracker.findAll();
            for (Item item: items) {
                System.out.println(item);
            }
            } else if (select == 2) {
                System.out.println("=== Edit Item ====");
                String requestId = scanner.nextLine();
                int id = Integer.parseInt(requestId);
                String req = scanner.nextLine();
                Item request = new Item(req);
                tracker.replace(id, request);
                if (tracker.replace(id, request)) {
                    System.out.println("Замена выполнена");
                } else {
                    System.out.println("Ошибка при попытке заменить");
                }
            } else if (select == 3) {
                System.out.println("=== Delete Item ====");
                String requestId = scanner.nextLine();
                int id = Integer.parseInt(requestId);
                tracker.delete(id);
                if (tracker.delete(id)) {
                    System.out.println("Удаление выполнено");
                } else {
                    System.out.println("Ошибка при попытке удалить");
                }
            } else if (select == 4) {
                System.out.println("=== Find Item by Id ====");
                String requestId = scanner.nextLine();
                int id = Integer.parseInt(requestId);
                Item item = tracker.findById(id);
                if (item != null) {
                    System.out.println(item);
                } else {
                    System.out.println("Заявка с таким id не найдена");
                }
            } else if (select == 5) {
                System.out.println("Find Items by Name");
                String req = scanner.nextLine();
                Item[] items = tracker.findByName(req);
                if (items.length > 0) {
                    for (Item item : items) {
                        System.out.println(item);
                    }
                } else {
                    System.out.println("Заявки с таким именем не найдены");
                }
            } else if (select == 6) {
                System.out.println("Exit Program");
                run = false;
            }
        }
    }

    private void showMenu() {
        System.out.println("Menu.");
        System.out.println("0. Add new Item");
        System.out.println("1. Show all items");
        System.out.println("2. Edit item");
        System.out.println("3. Delete item");
        System.out.println("4. Find item by Id");
        System.out.println("5. Find items by name");
        System.out.println("6. Exit Program");
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        new StartUI().init(scanner, tracker);

    }
 }
