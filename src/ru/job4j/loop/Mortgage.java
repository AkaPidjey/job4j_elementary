package ru.job4j.loop;

public class Mortgage {
    public int year(int amount, int salary, double percent) {
        int year = 0;
        double temp = amount;
        while (temp > 0) {
            year++;
            temp = temp * percent / 100 + temp - salary;
        }
        return year;
    }
}
