package ru.job4j.condition;

import  org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {

    @Test
    public void squareTest() {
        double expected = 2;
        double out = SqArea.square(6, 2);
        Assert.assertEquals(expected, out, 0.1);
    }
}
