package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TriangleTest {

    @Test
    public void whenExist() {
        Point a = new Point(1, 1);
        Point b = new Point(3, 3);
        Point c = new Point(2, 4);
        Triangle triangle = new Triangle(a, b, c);
        boolean result = triangle.exist(2.0, 2.0, 2.0);
        assertThat(result, is(true));
    }
    @Test
    public void whenNoExist() {
        Point a = new Point(1, 1);
        Point b = new Point(3, 3);
        Point c = new Point(2, 4);
        Triangle triangle = new Triangle(a, b, c);
        boolean result = triangle.exist(1.0, 3.0, 1.0);
        assertThat(result, is(false));
    }
    @Test
    public void whenPeriodRavno15() {
        Point a = new Point(1, 1);
        Point b = new Point(3, 3);
        Point c = new Point(2, 4);
        Triangle triangle = new Triangle(a, b, c);
        double expected = 1.5;
        double out = triangle.period(1.0, 1.0, 1.0);
        Assert.assertEquals(expected, out, 0.01);
    }
    @Test
    public void whenPeriodRavno30() {
        Point a = new Point(1, 1);
        Point b = new Point(3, 3);
        Point c = new Point(2, 4);
        Triangle triangle = new Triangle(a, b, c);
        double expected = 3.0;
        double out = triangle.period(1.0, 2.0, 3.0);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenAreaRavno196() {
        Point a = new Point(1, 1);
        Point b = new Point(3, 3);
        Point c = new Point(2, 4);
        Triangle triangle = new Triangle(a, b, c);
        double expected = 1.96;
        double out = triangle.area();
        Assert.assertEquals(expected, out, 0.05);
    }

}