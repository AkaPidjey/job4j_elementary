package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Triangle2Test {
    @Test
    public void whenArea173() {
        boolean result = Triangle.exist(2.0, 2.0, 2.0);
        assertThat(result, is(true));
    }
    @Test
    public void whenArea346() {
        Point2 a = new Point2(2, 2, 2);
        Point2 b = new Point2(3, 3, 3);
       double result = Point2()
        assertThat(result, is(false));
    }


}