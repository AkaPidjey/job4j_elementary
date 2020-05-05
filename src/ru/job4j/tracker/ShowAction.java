package ru.job4j.tracker;

public class ShowAction implements UserAction {
    @Override
    public String name() {
        return "==== Show all items =====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        Item[] temp = tracker.findAll();
        if (temp.length == 0) {
            System.out.println("No records");
        }
        for (int i = 0; i < temp.length; i++) {
            System.out.println(temp[i]);
        }
        return true;
    }
}
