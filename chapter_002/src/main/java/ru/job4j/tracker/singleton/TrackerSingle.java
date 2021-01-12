package ru.job4j.tracker.singleton;

import ru.job4j.tracker.Item;
import ru.job4j.tracker.Tracker;

public enum TrackerSingle {
    INSTANCE;
    private final Tracker value = new Tracker();

    public Tracker getInstance() {
        return value;
    }

    public static void main(String[] args) {
        Tracker tracker = TrackerSingle.INSTANCE.getInstance();
    }
}