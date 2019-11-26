package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }
    @Test
    public void whenMax3To2Then3() {
        int result1 = Max.max(3, 2);
        assertThat(result1, is(3));
    }

    @Test
    public void whenMax1To1Then1() {
        int result2 = Max.max(1, 1);
        assertThat(result2, is(1));
    }

    @Test
    public void maxTest1() {
        int rsl = Max.max(2, 4, 5);
        assertThat(rsl, is(5));
    }

    @Test
    public void maxTest2() {
        int rsl = Max.max(10, 4, 5);
        assertThat(rsl, is(10));
    }

    @Test
    public void maxTest3() {
        int rsl = Max.max(5, 4, 5);
        assertThat(rsl, is(5));
    }

    @Test
    public void maxTest4() {
        int rsl = Max.max(2, 4, 5, 10);
        assertThat(rsl, is(10));
    }

    @Test
    public void maxTest5() {
        int rsl = Max.max(10, 4, 5, 1);
        assertThat(rsl, is(10));
    }

    @Test
    public void maxTest6() {
        int rsl = Max.max(5, 4, 5, 2);
        assertThat(rsl, is(5));
    }
}
