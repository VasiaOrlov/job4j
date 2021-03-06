package ru.job4j.condition;

import  org.junit.Test;
import  org.junit.Assert;

public class PointTest {

    @Test
    public void distanceTest() {
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double expected = 2;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.02);
    }

    @Test
    public void distance3dTest() {
        Point a = new Point(0, 0, 0);
        Point b = new Point(2, 2, 2);
        double expected = 3.46;
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.02);
    }
}
