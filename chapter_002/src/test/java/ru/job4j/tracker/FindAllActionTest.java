package ru.job4j.tracker;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.StringJoiner;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class FindAllActionTest {
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();
    private final PrintStream def = System.out;

    @Before
    public void loadOutput() {
        System.setOut(new PrintStream(out));
    }

    @After
    public void afterOutput() {
        System.setOut(def);
    }

    @Test
    public void findAllTest() {
        Tracker tracker = new Tracker();
        Item item = new Item("fix bug");
        tracker.add(item);
        FindAllAction act = new FindAllAction();
        act.execute(new StubInput(new String[] {}), tracker);
        String expect = new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                .add("Список заявок:")
                .add("0. " + item.getName() + ", id = " + item.getId())
                .toString();
        assertThat(new String(out.toByteArray()), is(expect));
    }

    @Test
    public void whenEmptyTest() {
        Tracker tracker = new Tracker();
        FindAllAction act = new FindAllAction();
        act.execute(new StubInput(new String[] {}), tracker);
        String expect = new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                .add("Список заявок:")
                .add("Список пуст.")
                .toString();
        assertThat(new String(out.toByteArray()), is(expect));
    }
}
