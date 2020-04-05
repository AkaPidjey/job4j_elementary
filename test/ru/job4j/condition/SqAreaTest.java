package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SqAreaTest {

    @Test
    public void square() {
        int inP = 6;
        int inK = 2;
        double expectedS = 2;
        double out = SqArea.square(inP, inK);
        Assert.assertEquals(expectedS, out, 0.01);
    }
}