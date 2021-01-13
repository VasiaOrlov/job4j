package ru.job4j.tracker.singleton;

import ru.job4j.tracker.Tracker;

public class TrackerSingle1 {
    private static Tracker tracker;

    private TrackerSingle1() { }

    public static Tracker getTracker() {
        if (tracker == null) {
            tracker = new Tracker();
        }
        return tracker;
    }

    public static void main(String[] args) {
        Tracker tracker = TrackerSingle1.getTracker();
    }
}