package ru.job4j.loop;

public class PrimeNumber {
    public int calc(int finish) {
        int count = 0;
        boolean itog = true;
        for (int number = 2; number <= finish; number++) {
            if (CheckPrimeNumber.check(number) == itog) {
                count++;
            }
        }
        return count;
    }
}
