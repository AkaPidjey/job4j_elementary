package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Point2Test {
    @Test
    public void distanceRavno173() {
        Point2 a = new Point2(2, 2, 2);
        Point2 b = new Point2(3, 3, 3);
        double expected = 1.73;
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }
    @Test
    public void distanceRavno346() {
        Point2 a = new Point2(2, 2, 2);
        Point2 b = new Point2(4, 4, 4);
        double expected = 3.46;
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}