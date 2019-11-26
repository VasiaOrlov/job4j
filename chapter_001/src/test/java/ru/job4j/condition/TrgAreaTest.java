package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class TrgAreaTest {
    @Test
    public void areaTest1() {
        Point first = new Point(0, 0);
        Point second = new Point(2, 0);
        Point third = new Point(0, 2);
        TrgArea ap = new TrgArea(first, second, third);
        double expected = 2;
        Assert.assertEquals(expected, ap.area(), 0.02);
    }
    @Test
    public void areaTest2() {
        Point first = new Point(0, 0);
        Point second = new Point(1, 1);
        Point third = new Point(2, 2);
        TrgArea ap = new TrgArea(first, second, third);
        double expected = -1;
        Assert.assertEquals(expected, ap.area(), 0.02);
    }

}
