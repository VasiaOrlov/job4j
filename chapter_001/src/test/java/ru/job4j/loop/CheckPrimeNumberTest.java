package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CheckPrimeNumberTest {
    @Test
    public void checkTest1() {
        CheckPrimeNumber x = new CheckPrimeNumber();
        boolean result1 = x.check(17);
        assertThat(result1, is(true));
    }

    @Test
    public void checkTest2() {
        CheckPrimeNumber x2 = new CheckPrimeNumber();
        boolean result2 = x2.check(16);
        assertThat(result2, is(false));
    }
}
