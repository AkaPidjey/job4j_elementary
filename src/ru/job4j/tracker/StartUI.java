package ru.job4j.tracker;

//import java.util.Scanner; разрываем связь и вводим интерфейс
/**
 * Вместо вызова scanner.nextLine() написать input.askStr(msg),
 * где msg - это сообщение, которое вы хотели бы вывести пользователю перед его вводом, например "Enter id: ".
 */

public class StartUI {
    public void init(Input input, Tracker tracker) { //(Scanner scanner, Tracker tracker)
        boolean run = true;
        while (run) {
            this.showMenu();
            int select = Integer.valueOf(input.askStr("Select:"));
            if (select == 0) {
                System.out.println("=== Create a new Item ====");
            //    System.out.print("Enter name: ");
                String name = input.askStr("Enter name: ");
                Item item = new Item(name);
                tracker.add(item);
                System.out.println("Record created");
            } else if (select == 1) {
                System.out.println("==== Show all items ====");
                Item[] temp = tracker.findAll();
                if (temp.length == 0) {
                    System.out.println("No records");
                }

                for (int i = 0; i < temp.length; i++) {
                    System.out.println(temp[i]);
                }
            } else if (select == 2) {
                System.out.println("==== Edit item ====");
            //    System.out.print("Enter id: ");
                String nameId = input.askStr("Enter id: ");
            //    System.out.print("Enter replays name: ");
                String nameNew = input.askStr("Enter replays name: ");
                Item item = new Item(nameNew);
                if (tracker.replace(nameId, item)) {
                    System.out.print("Completed");
                } else {
                    System.out.print("Not completed");
                }
            } else if (select == 3) {
                System.out.println("==== Delete item ====");
            //    System.out.print("Enter id: ");
                String nameId = input.askStr("Enter id: ");
                if (tracker.delete(nameId)) {
                    System.out.print("Completed");
                } else {
                    System.out.print("Not completed");
                }
            } else if (select == 4) {
                System.out.println("==== Find item by Id ====");
            //    System.out.print("Enter id: ");
                String id = input.askStr("Enter id: ");
                Item tempid = tracker.findById(id);
                if (tempid == null) {
                    System.out.println("ID not found");
                } else {
                    System.out.println(tempid);
                }
            } else if (select == 5) {
                System.out.println("==== Find items by name ====");
            //    System.out.print("Enter name: ");
                String name = input.askStr("Enter name: ");
                Item[] tempName = tracker.findByName(name);
                for (int i = 0; i < tempName.length; i++) {
                   System.out.println(tempName[i]);
                }
            } else if (select == 6) {
                System.out.println("==== Exit Program ====");
                run = false;
            }
        }
    }

    private void showMenu() {
        System.out.println(" ");
        System.out.println("Menu.");
        System.out.println("0. Add new Item");
        System.out.println("1. Show all items");
        System.out.println("2. Edit item");
        System.out.println("3. Delete item");
        System.out.println("4. Find item by Id");
        System.out.println("5. Find items by name");
        System.out.println("6. Exit Program");
    //    System.out.println("Select:");
    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUI().init(input, tracker);

    }
}
