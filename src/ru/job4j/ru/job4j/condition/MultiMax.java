package ru.job4j.ru.job4j.condition;

public class MultiMax {
    public int max(int first, int second, int third) {
        boolean itog1 = first > second;
        int itog2 = itog1 ? first : second;
        boolean itog3 = itog2 > third;
        int result = itog3 ? itog2 : third;
        return result;
    }
}
