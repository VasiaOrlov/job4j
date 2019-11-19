package ru.job4j.loop;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class PrimeNumberTest {
    @Test
    public void calcTest1() {
        PrimeNumber number1 = new PrimeNumber();
        int result1 = number1.calc(5);
        assertThat(result1, is(3));
    }
    @Test
    public void calcTest2() {
        PrimeNumber number2 = new PrimeNumber();
        int result2 = number2.calc(11);
        assertThat(result2, is(5));
    }
    @Test
    public void calcTest3() {
        PrimeNumber number3 = new PrimeNumber();
        int result3 = number3.calc(2);
        assertThat(result3, is(1));
    }

}
