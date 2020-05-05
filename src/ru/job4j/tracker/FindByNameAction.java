package ru.job4j.tracker;

public class FindByNameAction implements UserAction {
    @Override
    public String name() {
        return "==== Find items by name =";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String name = input.askStr("Enter name: ");
        Item[] tempName = tracker.findByName(name);
        for (int i = 0; i < tempName.length; i++) {
            System.out.println(tempName[i]);
        }
        return true;
    }
}
