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
            int select = input.askInt("Select:", actions.length);
            UserAction action = actions[select];
            run = action.execute(input, tracker);
        }
    }

    private void showMenu(UserAction[] actions) {
    //    System.out.println(" ");
        System.out.println("Menu.");
        for (int index = 0; index < actions.length; index++) {
            System.out.println(index + ". " + actions[index].name());
        }
    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Input validate = new ValidateInput(input);
        Tracker tracker = new Tracker();
        UserAction[] actions = new UserAction[7];
        actions[0] = new CreateAction();
        actions[1] = new FindAllAction();
        actions[2] = new ReplaceAction();
        actions[3] = new DeleteAction();
        actions[4] = new FindByIdAction();
        actions[5] = new FindByNameAction();
        actions[6] = new ExitAction();
        new StartUI().init(validate, tracker, actions);
    }

}
