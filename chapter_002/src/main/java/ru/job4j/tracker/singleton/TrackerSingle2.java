package ru.job4j.tracker.singleton;

import ru.job4j.tracker.Item;
import ru.job4j.tracker.Tracker;

public class TrackerSingle2 {
    private static final TrackerSingle2 INSTANCE = new TrackerSingle2();
    private final Tracker value = new Tracker();

    private TrackerSingle2() { }

    public static TrackerSingle2 getInstance() {
        return INSTANCE;
    }

    public Item add(Item item) {
        return value.add(item);
    }

    public boolean delete(String id) {
        return value.delete(id);
    }

    public boolean replace(String id, Item item) {
        return value.replace(id, item);
    }

    public Item[] findAll() {
        return value.findAll();
    }

    public Item[] findByName(String key) {
        return value.findByName(key);
    }

    public Item findById(String id) {
        return value.findById(id);
    }

    public static void main(String[] args) {
        TrackerSingle2 tracker = TrackerSingle2.getInstance();
    }
}
