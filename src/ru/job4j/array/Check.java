package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
        if (data[0] == result) {
            for (int index = 0; index < data.length - 1; index++) {
                if (!data[index]) {
                    result = false;
                    break;
                }
            }
        } else {
            for (int index = 0; index < data.length - 1; index++) {
                if (data[index]) {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }
}
