package ru.job4j.tracker;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ItemSorter {
    public static void main(String[] args) {
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
         try {
             Collections.sort(items);
         } catch (Exception e) {
             System.out.println("в id должен быть int");
        }
        System.out.println(items);
        try {
            Collections.sort(items, Collections.reverseOrder());
        } catch (Exception e) {
            System.out.println("в id должен быть int");
        }
        System.out.println(items);
        Collections.sort(items, new ItemSortNameIncrease());
        System.out.println(items);
        Collections.sort(items, new ItemSortNameDecrease());
        System.out.println(items);
    }
}
