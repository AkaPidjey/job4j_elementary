package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.calculator.Fit;

import static org.junit.Assert.*;

public class PointTest {
    @Test
    public void distanceRavno2() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double expected = 2.0;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }
    @Test
    public void distanceRavno5() {
        Point a = new Point(2, 2);
        Point b = new Point(-2, -2);
        double expected = 5.65;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }
    @Test
    public void distanceRavno173() {
        Point a = new Point(2, 2, 2);
        Point b = new Point(3, 3, 3);
        double expected = 1.73;
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }
    @Test
    public void distanceRavno346() {
        Point a = new Point(2, 2, 2);
        Point b = new Point(4, 4, 4);
        double expected = 3.46;
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }

  /*  @Test
    public void distanceRavno5() {
        int inx1 = 2;
        int iny1 = 2;
        int inx2 = -2;
        int iny2 = -2;
        double expected = 5.65;
        double out = Point.distance(inx1, iny1, inx2, iny2);
        Assert.assertEquals(expected, out, 0.01);
    }  */
}