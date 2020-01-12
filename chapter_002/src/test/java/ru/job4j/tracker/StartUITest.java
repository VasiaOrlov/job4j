package ru.job4j.tracker;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.StringJoiner;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class StartUITest {
    @Test
    public void createItemTest() {
        String[] answers = {"Fix PC"};
        Input input = new StubInput(answers);
        Tracker tracker = new Tracker();
        StartUI.createItem(input, tracker);
        Item created = tracker.findAll()[0];
        Item expected = new Item("Fix PC");
        assertThat(created.getName(), is(expected.getName()));
    }

    @Test
    public void replaceItemTest() {
        Tracker tracker = new Tracker();
        Item item = new Item("New Item");
        tracker.add(item);
        String[] answers = {item.getId(), "replaced item"};
        StartUI.replaceItem(new StubInput(answers), tracker);
        Item replaced = tracker.findById(item.getId());
        assertThat(replaced.getName(), is("replaced item"));
    }

    @Test
    public void deleteItemTest() {
        Tracker tracker = new Tracker();
        Item item = new Item("Delete");
        tracker.add(item);
        String[] answers = {item.getId()};
        StartUI.deleteItem(new StubInput(answers), tracker);
        assertThat(null, is(tracker.findById(item.getId())));
    }

    @Test
    public void whenExit() {
        StubInput input = new StubInput(new String[] {"0"});
        StubAction action = new StubAction();
        new StartUI().init(input, new Tracker(), new UserAction[] {action});
        assertThat(action.isCall(), is(true));
    }

    @Test
    public void prtMenu() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream def = System.out;
        System.setOut(new PrintStream(out));
        StubInput input = new StubInput(new String[] {"0"});
        StubAction action = new StubAction();
        new StartUI().init(input, new Tracker(), new UserAction[] {action});
        String expect = new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                .add("Menu.")
                .add("0. Stub action")
                .toString();
        assertThat(new String(out.toByteArray()), is(expect));
        System.setOut(def);
    }
}
