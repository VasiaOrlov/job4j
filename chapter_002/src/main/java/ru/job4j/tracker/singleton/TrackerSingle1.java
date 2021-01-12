package ru.job4j.tracker.singleton;

import ru.job4j.tracker.Item;
import ru.job4j.tracker.Tracker;

public class TrackerSingle1 {
    private static TrackerSingle1 instance;
    private final Tracker value = new Tracker();

    private TrackerSingle1() { }

    public static TrackerSingle1 getInstance() {
        if (instance == null) {
            instance = new TrackerSingle1();
        }
        return instance;
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
        TrackerSingle1 tracker = TrackerSingle1.getInstance();
    }

}