package ru.job4j.tracker;

public class FindByNameAction implements UserAction {
    @Override
    public String name() {
        return "==== Find items by name =";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String name = input.askStr("Enter name: ");
        for (Item item : tracker.findByName(name)) {
            System.out.println(String.format("%s %s", item.getId(), item.getName()));
        }
        return true;
    }
}


