package ru.job4j.condition;

public class MultiMax {
    public int max(int first, int second, int third) {
        int itog1 = first > second ? first : second;
        int result = itog1 > third ? itog1 : third;
        return result;
        /*
        boolean itog1 = first > second;
        int itog2 = itog1 ? first : second;
        boolean itog3 = itog2 > third;
        int result = itog3 ? itog2 : third;
        return result;
        */
    }
}
