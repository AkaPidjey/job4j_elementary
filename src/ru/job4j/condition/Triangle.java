package ru.job4j.condition;

public class Triangle {
    private Point first;
    private Point second;
    private Point third;

    public Triangle(Point ap, Point bp, Point cp) {
        this.first = ap;
        this.second = bp;
        this.third = cp;
    }
    public boolean exist(double ab, double ac, double bc) {
        boolean itog = (ab + ac) > bc && (ac + bc) > ab && (ab + bc) > ac;
        return itog;
    }

    public double period(double a, double b, double c) {
        double itog = (a + b + c) / 2;
        return itog;
    }

    public double area() {
        double rs1 = -1;
        double a = first.distance(second);
        double b = first.distance(third);
        double c = second.distance(third);
        double p = period(a, b, c);
        if (this.exist(a, b, c)) {
            rs1 = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        }
        return rs1;
    }
}
