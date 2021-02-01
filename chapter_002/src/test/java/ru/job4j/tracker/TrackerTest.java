package ru.job4j.tracker;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Class TrackerTest.
 * @author Vasiliy Orlov.
 */
public class TrackerTest {
    @Test
    public void findById() {
       Tracker tracker = new Tracker();
       Item first = new Item("test");
       tracker.add(first);
       assertThat(first, is(tracker.findById(first.getId())));
    }

    @Test
    public void addTest() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1");
        tracker.add(item);
        Item result = tracker.findById(item.getId());
        assertThat(result.getName(), is(item.getName()));
    }

    @Test
    public void replaceTest() {
        Tracker tracker = new Tracker();
        Item item = new Item("first");
        tracker.add(item);
        Item item1 = new Item("second");
        item1.setId(item.getId());
        tracker.replace(item.getId(), item1);
        assertThat(item1.getName(), is(tracker.findById(item.getId()).getName()));
    }

    @Test
    public void findAllTest() {
        Tracker tracker = new Tracker();
        Item first = new Item("first");
        tracker.add(first);
        Item second = new Item("second");
        tracker.add(second);
        List<Item> result = new ArrayList<>();
        result.add(first);
        result.add(second);
        assertThat(result, is(tracker.findAll()));
    }

    @Test
    public void findByNameTest() {
        Tracker tracker = new Tracker();
        Item first1 = new Item("first");
        tracker.add(first1);
        Item second = new Item("second");
        tracker.add(second);
        Item first2 = new Item("first");
        tracker.add(first2);
        Item third = new Item("third");
        tracker.add(third);
        List<Item> result = tracker.findByName("first");
        List<Item> extended = new ArrayList<>();
        extended.add(first1);
        extended.add(first2);
        assertThat(extended, is(result));
    }

    @Test
    public void deleteTest() {
        Tracker tracker = new Tracker();
        Item first = new Item("first");
        tracker.add(first);
        Item second = new Item("second");
        tracker.add(second);
        Item third = new Item("third");
        tracker.add(third);
        tracker.delete(second.getId());
        List<Item> extended = new ArrayList<>();
        extended.add(first);
        extended.add(third);
        assertThat(extended, is(tracker.findAll()));
    }
}
