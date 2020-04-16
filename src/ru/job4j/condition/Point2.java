package ru.job4j.condition;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Point2 {
    private int x;
    private int y;
    private int z;

    public Point2(int first, int second) {
        this.x = first;
        this.y = second;
    }
    public Point2(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public double distance(Point2 that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2));
    }
    public double distance3d(Point2 that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2) + pow(this.z - that.z, 2));
    }
    public void info() {
        System.out.println(String.format("Point[%s, %s]", this.x, this.y, this.z));
    }
    public static void main(String[] args) {
        Point2 a = new Point2(2, 2, 2);
        Point2 b = new Point2(3, 3, 3);
        double dist = a.distance3d(b);
        System.out.println(dist);
    }
}
