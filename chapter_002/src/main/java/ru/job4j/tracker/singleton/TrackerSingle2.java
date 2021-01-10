package ru.job4j.tracker.singleton;

import ru.job4j.tracker.Item;
import ru.job4j.tracker.Tracker;

public class TrackerSingle2 {
    private static final TrackerSingle2 INSTANCE = new TrackerSingle2();
    private static final Tracker VALUE = new Tracker();

    private TrackerSingle2() { }

    public static TrackerSingle2 getInstance() {
        return INSTANCE;
    }

    public static Item add(Item item) {
        return VALUE.add(item);
    }

    public static void main(String[] args) {
        TrackerSingle2 tracker = TrackerSingle2.getInstance();
    }
}
