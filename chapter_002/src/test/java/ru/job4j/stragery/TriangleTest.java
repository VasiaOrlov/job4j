package ru.job4j.stragery;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class TriangleTest {
    @Test
    public void drawTest() {
        Triangle tr = new Triangle();
        assertThat(tr.draw(), is(new StringBuilder()
                .append("+  " + System.lineSeparator())
                .append("++ " + System.lineSeparator())
                .append("+++" + System.lineSeparator())
                .toString()
        ));
    }
}
