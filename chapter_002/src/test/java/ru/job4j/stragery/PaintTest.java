package ru.job4j.stragery;

import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PaintTest {
    @Test
    public void drawSquareTest() {
        PrintStream stdout = System.out;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        new Paint().draw(new Square());
        assertThat(
                new String(out.toByteArray()),
                is(
                        new StringBuilder()
                                .append("+++" + System.lineSeparator())
                                .append("+ +" + System.lineSeparator())
                                .append("+++" + System.lineSeparator())
                                .append(System.lineSeparator())
                                .toString()
                )
        );
        System.setOut(stdout);
    }

    @Test
    public void drawTriangleTest() {
        PrintStream stdout = System.out;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        new Paint().draw(new Triangle());
        assertThat(
                new String(out.toByteArray()),
                is(
                        new StringBuilder()
                                .append("+  " + System.lineSeparator())
                                .append("++ " + System.lineSeparator())
                                .append("+++" + System.lineSeparator())
                                .append(System.lineSeparator())
                                .toString()
                )
        );
        System.setOut(stdout);
    }
}
