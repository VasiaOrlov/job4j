package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SqMaxTest {
    @Test
    public void whenFirstMax() {
        SqMax check = new SqMax();
        int result = check.max(9, 3, 5, 7);
        assertThat(result, is(9));
    }

    @Test
    public void whenSecondMax() {
        SqMax check1 = new SqMax();
        int result1 = check1.max(1, 9, 5, 7);
        assertThat(result1, is(9));
    }

    @Test
    public void whenThirdMax() {
        SqMax check2 = new SqMax();
        int result2 = check2.max(10, 3, 90, 7);
        assertThat(result2, is(90));
    }

    @Test
    public void whenForthMax() {
        SqMax check3 = new SqMax();
        int result3 = check3.max(18, 13, 15, 19);
        assertThat(result3, is(19));
    }
}
