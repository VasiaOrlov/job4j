package ru.job4j.lambda;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;
import java.util.List;
import java.util.Arrays;
import org.junit.Test;


public class CountTest {
    @Test
    public void diapasonLinearTest() {
        Count function = new Count();
        List<Double> result = function.diapason(5, 8, x -> 2 * x + 1);
        List<Double> expected = Arrays.asList(11D, 13D, 15D, 17D);
        assertThat(result, is(expected));
    }

    @Test
    public void diapasonSquareTest() {
        Count function = new Count();
        List<Double> result = function.diapason(2, 4, x -> x * x + 1);
        List<Double> expected = Arrays.asList(5D, 10D, 17D);
        assertThat(result, is(expected));
    }

    @Test
    public void diapasonDegreeTest() {
        Count function = new Count();
        List<Double> result = function.diapason(2, 4, x -> Math.pow(3, x) + 1);
        List<Double> expected = Arrays.asList(10D, 28D, 82D);
        assertThat(result, is(expected));
    }
}