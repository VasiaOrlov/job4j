package ru.job4j.tracker.singleton;

import ru.job4j.tracker.Item;
import ru.job4j.tracker.Tracker;

public enum TrackerSingle {
    INSTANCE;
    private final Tracker tracker = new Tracker();

    public Tracker getTracker() {
        return tracker;
    }

    public static void main(String[] args) {
        Tracker tracker = TrackerSingle.INSTANCE.getTracker();
    }
}