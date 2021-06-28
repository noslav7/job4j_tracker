package ru.job4j.tracker;

import java.util.Scanner;

public class  StartUI {

    public void init(Scanner scanner, Tracker tracker) {
        boolean run = true;
        while (run) {
            showMenu();
            System.out.println("Select: ");
            int select = Integer.parseInt(scanner.nextLine());
            if (select == 0) {
                System.out.println("=== Create a New Item ====");
                System.out.println("Enter name: ");
                String name = scanner.nextLine();
                Item item = new Item(name);
                tracker.add(item);
                System.out.println("Добавленная заявка" + item);
            } else if (select == 6) {
                run = false;
            }
        }
    }

        private void showMenu() {
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
            Scanner scanner = new Scanner(System.in);
            Tracker tracker = new Tracker();
            new StartUI().init(scanner, tracker);

        }
    }
