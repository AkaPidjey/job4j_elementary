package ru.job4j.tracker;

/**
 * Вместо вызова scanner.nextLine() написать input.askStr(msg),
 * где msg - это сообщение, которое вы хотели бы вывести пользователю перед его вводом, например "Enter id: ".
 */

public class StartUI {

    public void init(Input input, Tracker tracker, UserAction[] actions) {
        boolean run = true;
        while (run) {
            this.showMenu(actions);
            int select = input.askInt("Select:");
            UserAction action = actions[select];
            run = action.execute(input, tracker);
        }
    }

    private void showMenu(UserAction[] actions) {
        System.out.println(" ");
        System.out.println("Menu.");
        for (int index = 0; index < actions.length; index++) {
            System.out.println(index + ". " + actions[index].name());
        }
    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        //    new StartUI().init(input, tracker);
        UserAction[] actions = new UserAction[7];
        actions[0] = new CreateAction();
        actions[1] = new ShowAction();
        actions[2] = new ReplaceAction();
        actions[3] = new DeleteAction();
        actions[4] = new FindByIdAction();
        actions[5] = new FindByNameAction();
        actions[6] = new ExitAction();
        new StartUI().init(input, tracker, actions);
    }


/*            if (select == 0) {
                StartUI.createItem(input, tracker);
            } else if (select == 1) {
                StartUI.showItems(input, tracker);
            } else if (select == 2) {
                StartUI.replaceItem(input, tracker);
            } else if (select == 3) {
                StartUI.deleteItem(input, tracker);
            } else if (select == 4) {
                StartUI.findItemById(input, tracker);
            } else if (select == 5) {
                StartUI.findItemByName(input, tracker);
            } else if (select == 6) {
                System.out.println("==== Exit Program ====");
                run = false;
            }


     public  static void createItem(Input input, Tracker tracker) {
        System.out.println("=== Create a new Item ====");
        String name = input.askStr("Enter name: ");
        Item item = new Item(name);
        tracker.add(item);
        System.out.println("Record created");
    }



    public  static void showItems(Input input, Tracker tracker) {
        System.out.println("==== Show all items ====");
        Item[] temp = tracker.findAll();
        if (temp.length == 0) {
            System.out.println("No records");
        }
        for (int i = 0; i < temp.length; i++) {
            System.out.println(temp[i]);
        }
    }

    public  static void replaceItem(Input input, Tracker tracker) {
        System.out.println("==== Update item ====");
        String id = input.askStr("Enter id: ");
        String name = input.askStr("Enter a new name of item: ");
        Item item = new Item(name);
        item.setId(id);
        if (tracker.replace(id, item)) {
            System.out.print("Completed");
        } else {
            System.out.print("Not completed");
        }
    }

    public  static void deleteItem(Input input, Tracker tracker) {
        System.out.println("==== Delete item ====");
        String nameId = input.askStr("Enter id: ");
        if (tracker.delete(nameId)) {
            System.out.print("Completed");
        } else {
            System.out.print("Not completed");
        }
    }

    public  static void findItemById(Input input, Tracker tracker) {
        System.out.println("==== Find item by Id ====");
        String id = input.askStr("Enter id: ");
        Item tempid = tracker.findById(id);
        if (tempid == null) {
            System.out.println("ID not found");
        } else {
            System.out.println(tempid);
        }
    }

    public  static void findItemByName(Input input, Tracker tracker) {
        System.out.println("==== Find items by name ====");
        String name = input.askStr("Enter name: ");
        Item[] tempName = tracker.findByName(name);
        for (int i = 0; i < tempName.length; i++) {
            System.out.println(tempName[i]);
        }
    }


        System.out.println("0. Add new Item");
        System.out.println("1. Show all items");
        System.out.println("2. Edit item");
        System.out.println("3. Delete item");
        System.out.println("4. Find item by Id");
        System.out.println("5. Find items by name");
        System.out.println("6. Exit Program");
    }

*/


}
