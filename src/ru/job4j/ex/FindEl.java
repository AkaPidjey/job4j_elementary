package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        if () {
            throw  new ElementNotFoundException("No value");
        }
        int rsl = -1;
        for (int i = 0; i < value.length; i++) {
            if (key == value[i]) {
                rsl = i;
            }
        }
        return rsl;


    }
    public static void main(String[] args) {
        try {
            indexOf("No value");
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}
