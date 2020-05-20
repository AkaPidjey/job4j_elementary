package ru.job4j.sort;

import java.util.Arrays;

public class Machine {
    private final int[] COINS = {10, 5, 2, 1};

    public int[] change(int money, int price) {
        int[] rsl = new int[100];
        int size = 0;
        int result = money - price;
        for (int a = 0; a < COINS.length; a++) {
            while (result >= COINS[a]) {
                result = result - COINS[a];
                rsl[size] = COINS[a];
                size++;
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}
