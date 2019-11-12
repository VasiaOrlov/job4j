package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CounterTest {
    @Test
    public void addtest() {
        Counter counter = new Counter();
        int result = counter.add(4, 12);
        assertThat(result, is(40));
    }
}
