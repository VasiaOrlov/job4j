package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MultiMaxTest {
    @Test
    public void whenSecondMax() {
        MultiMax check = new MultiMax();
        int result = check.max(1, 4, 2);
        assertThat(result, is(4));
    }
    @Test
    public void whenFirstMax() {
        MultiMax check = new MultiMax();
        int result1 = check.max(10, 4, 2);
        assertThat(result1, is(10));
    }
    @Test
    public void whenThirdMax() {
        MultiMax check = new MultiMax();
        int result2 = check.max(1, 4, 7);
        assertThat(result2, is(7));
    }
    @Test
    public void whenEqualMax() {
        MultiMax check = new MultiMax();
        int result3 = check.max(1, 1, 1);
        assertThat(result3, is(1));
    }
}
