package ru.job4j.tracker.singleton;

import ru.job4j.tracker.Item;
import ru.job4j.tracker.Tracker;

public enum TrackerSingle {
    INSTANCE;
    private static final Tracker VALUE = new Tracker();

    public static Item add(Item item) {
        return VALUE.add(item);
    }

    public static void main(String[] args) {
        TrackerSingle tracker = TrackerSingle.INSTANCE;
    }
}










