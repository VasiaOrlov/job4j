package ru.job4j.tracker;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.*;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ItemSorterTest {
    @Test
    public void idIncreaseTest() {
        Item first = new Item("petr");
        first.setId("2");
        Item second = new Item("egor");
        second.setId("3");
        Item third = new Item("ivan");
        third.setId("1");
        List<Item> items = Arrays.asList(
                first,
                second,
                third
        );
        List<Item> expect = Arrays.asList(
                third,
                first,
                second
        );
        Collections.sort(items);
        assertThat(expect, is(items));
    }

    @Test
    public void idDecreaseTest() {
        Item first = new Item("petr");
        first.setId("2");
        Item second = new Item("egor");
        second.setId("3");
        Item third = new Item("ivan");
        third.setId("1");
        List<Item> items = Arrays.asList(
                first,
                second,
                third
        );
        List<Item> expect = Arrays.asList(
                second,
                first,
                third
        );
        Collections.sort(items, Collections.reverseOrder());
        assertThat(expect, is(items));
    }

    @Test
    public void nameIncreaseTest() {
        Item first = new Item("petr");
        first.setId("2");
        Item second = new Item("egor");
        second.setId("3");
        Item third = new Item("ivan");
        third.setId("1");
        List<Item> items = Arrays.asList(
                first,
                second,
                third
        );
        List<Item> expect = Arrays.asList(
                second,
                third,
                first
        );
        Collections.sort(items, new ItemSortNameIncrease());
        assertThat(expect, is(items));
    }

    @Test
    public void nameDecreaseTest() {
        Item first = new Item("petr");
        first.setId("2");
        Item second = new Item("egor");
        second.setId("3");
        Item third = new Item("ivan");
        third.setId("1");
        List<Item> items = Arrays.asList(
                first,
                second,
                third
        );
        List<Item> expect = Arrays.asList(
                first,
                third,
                second
        );
        Collections.sort(items, new ItemSortNameDecrease());
        assertThat(expect, is(items));
    }

}