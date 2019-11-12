package ru.job4j.loop;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import  static org.hamcrest.core.Is.is;

public class FactorialTest {
    @Test
    public void calcTest1() {
        Factorial sum = new Factorial();
        int result1 = sum.calc(5);
        assertThat(result1, is(120));
    }

    @Test
    public void calcTest2() {
        Factorial sum = new Factorial();
        int result2 = sum.calc(0);
        assertThat(result2, is(1));
    }
}
