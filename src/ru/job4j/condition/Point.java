package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double res1 = x2 - x1;
        double res2 = y2 - y1;
        double res3 = Math.pow(res1, 2);
        double res4 = Math.pow(res2, 2);
        double res5 = res3 + res4;
        double rsl = Math.sqrt(res5);
        return rsl;
    }

    public static void main(String[] args) {
        double result = Point.distance(2, 2, -2, -2);
        System.out.println("result (2, 2) to (-2, -2) = " + result);
    }
}
