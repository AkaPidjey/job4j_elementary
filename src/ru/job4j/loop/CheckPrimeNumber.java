package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = true;
            if (number == 1) {
                prime = false;
            } else if (number == 2) {
                prime = true;
            } else if (number == 3) {
                prime = true;
            }
        for (int a = 2; a < number; a++) {
             if (number % 2 == 0 || number % 3 == 0) {
                prime = false;
                break;
             }
        }
        return prime;
    }
}
