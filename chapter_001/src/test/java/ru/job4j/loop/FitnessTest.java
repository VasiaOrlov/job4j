package ru.job4j.loop;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class FitnessTest {
    @Test
    public void calcTest1() {
        Fitness value1 = new Fitness();
        int result1 = value1.calc(95, 90);
        assertThat(result1, is(0));
    }

    @Test
    public void calcTest2() {
        Fitness value2 = new Fitness();
        int result2 = value2.calc(90, 95);
        assertThat(result2, is(1));
    }

    @Test
    public void calcTest3() {
        Fitness value3 = new Fitness();
        int result3 = value3.calc(50, 90);
        assertThat(result3, is(2));
    }
}
