package ru.job4j.condition;

public class Max2 {
    public static int max(int first, int second) {
        return first > second ? first : second;
    }
    public static int max(int first, int second, int third) {
        return max(first, max(second, third));
    }
    public static int max(int first, int second, int third, int fourth) {
        return max(first, max(second, third, fourth));
    }



    /*public static int max(int first, int second) {
        return first > second ? first : second;
    }
    public static int max(int first, int second, int third) {
        return first > max(second, third) ? first : max(second, third);
    }
    public static int max(int first, int second, int third, int fourth) {
        return first > max(second, third, fourth) ? first : max(second, third, fourth);
    } */
}
