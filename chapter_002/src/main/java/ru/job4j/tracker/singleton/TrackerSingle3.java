package ru.job4j.tracker.singleton;

import ru.job4j.tracker.Item;
import ru.job4j.tracker.Tracker;

public class TrackerSingle3 {
    private final Tracker value = new Tracker();

    private TrackerSingle3() {
    }

    public static TrackerSingle3 getInstance() {
        return Holder.INSTANCE;
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

    private static final class Holder {
        private static final TrackerSingle3 INSTANCE = new TrackerSingle3();
    }

    public static void main(String[] args) {
        TrackerSingle3 tracker = TrackerSingle3.getInstance();
    }
}