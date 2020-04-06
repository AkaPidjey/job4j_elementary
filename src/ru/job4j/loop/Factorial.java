package ru.job4j.loop;

public class Factorial {
    public static int calc(int n) {
        int fact = 1;
        for (int a = 1; a <= n; a++) {
            fact = fact * a;
        }
        return fact;
    }
}
