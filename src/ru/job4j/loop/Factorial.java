package ru.job4j.loop;

public class Factorial {
    public static int calc(int n) {
        int fac = 1;
        for (int a = 1; a <= n; a++) {
            fac = fac * a;
        }
        return fac;
    }
}
