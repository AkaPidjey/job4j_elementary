package ru.job4j.tracker;

import java.util.Scanner;

public class StartUI {
    public void init(Scanner scanner, Tracker tracker) {
        boolean run = false;
        while (run) {
            this.showMenu();
            System.out.print("Select: ");
            int select = Integer.valueOf(scanner.nextLine());
            if (select == 0) {                                          //+
                System.out.println("=== Create a new Item ====");
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                Item item = new Item(name);
                tracker.add(item);
            } else if (select == 1) {                                    //+
                System.out.println("==== Show all items ====");
                System.out.println(tracker.findAll());
            } else if (select == 2) {                                    //+
                System.out.println("==== Edit item ====");
                System.out.print("Enter id: ");
                String nameId = scanner.nextLine();
                System.out.print("Enter replays name: ");
                String nameNew = scanner.nextLine();
                Item item = new Item(nameNew);
                if (tracker.replace(nameId, item)) {
                    System.out.print("Completed");
                } else {
                    System.out.print("Not completed");
                }
            } else if (select == 3) {                                    //+
                System.out.println("==== Delete item ====");
                System.out.print("Enter id: ");
                String nameId = scanner.nextLine();
                if (tracker.delete(nameId)) {
                    System.out.print("Completed");
                } else {
                    System.out.print("Not completed");
                }
            } else if (select == 4) {                                    //+
                System.out.println("==== Find item by Id ====");
                System.out.print("Enter id: ");
                String nameId = scanner.nextLine();
                tracker.findById(nameId);                                //+
            } else if (select == 5) {
                System.out.println("==== Find items by name ====");
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                tracker.findByName(name);
            } else if (select == 6) {                                   //+
                System.out.println("==== Exit Program ====");
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
        System.out.println("Select:");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        new StartUI().init(scanner, tracker);

    }
}
