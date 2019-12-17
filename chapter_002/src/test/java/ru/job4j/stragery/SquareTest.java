package ru.job4j.stragery;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class SquareTest {
    @Test
    public void drawTest() {
        Square sq = new Square();
        assertThat(sq.draw(), is(new StringBuilder()
                .append("+++" + System.lineSeparator())
                .append("+ +" + System.lineSeparator())
                .append("+++" + System.lineSeparator())
                .toString()
        ));
    }
}
