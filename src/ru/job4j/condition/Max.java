package ru.job4j.condition;

public class Max {
    public static int max(int first, int second) {
        boolean itog = first > second;
        int result = itog ? first : second;
        return result;
    }
}
