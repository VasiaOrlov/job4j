package ru.job4j.condition;

import  org.junit.Test;
import  org.junit.Assert;

public class PointTest {

    @Test
    public void distanceTest() {
        double expected = 7.2;
        double out = Point.distance(4, 0, 10, 4);
        Assert.assertEquals(expected, out, 0.02);
    }
}
