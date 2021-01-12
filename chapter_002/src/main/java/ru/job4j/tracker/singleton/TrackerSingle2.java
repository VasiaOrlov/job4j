package ru.job4j.tracker.singleton;

import ru.job4j.tracker.Tracker;

public class TrackerSingle2 {
    private static final TrackerSingle2 INSTANCE = new TrackerSingle2();
    private static final Tracker VALUE = new Tracker();

    private TrackerSingle2() { }

    public static Tracker getInstance() {
        return VALUE;
    }

    public static void main(String[] args) {
        Tracker tracker = TrackerSingle2.getInstance();
    }
}
