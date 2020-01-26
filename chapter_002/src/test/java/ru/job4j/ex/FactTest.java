package ru.job4j.ex;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class FactTest {

    @Test(expected = IllegalArgumentException.class)
    public void factTest() {
        Fact fact = new Fact();
        fact.calc(-1);
    }

    @Test
    public void factTes1() {
        Fact fact = new Fact();
        int expect = fact.calc(5);
        assertThat(expect, is(120));
    }
}
