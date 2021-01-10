package ru.job4j.tracker.singleton;

import ru.job4j.tracker.Item;
import ru.job4j.tracker.Tracker;

public class TrackerSingle1 {
    private static TrackerSingle1 instance;
    private static final Tracker VALUE = new Tracker();

    private TrackerSingle1() { }

    public static TrackerSingle1 getInstance() {
        if (instance == null) {
            instance = new TrackerSingle1();
        }
        return instance;
    }

    public static Item add(Item item) {
        return VALUE.add(item);
    }

    public static void main(String[] args) {
        TrackerSingle1 tracker = TrackerSingle1.getInstance();
    }

}