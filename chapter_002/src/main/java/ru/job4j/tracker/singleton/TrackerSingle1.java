package ru.job4j.tracker.singleton;

import ru.job4j.tracker.Tracker;

public class TrackerSingle1 {
    private static TrackerSingle1 instance;
    private static final Tracker VALUE = new Tracker();

    private TrackerSingle1() { }

    public static Tracker getInstance() {
        if (instance == null) {
            instance = new TrackerSingle1();
        }
        return VALUE;
    }

    public static void main(String[] args) {
        Tracker tracker = TrackerSingle1.getInstance();
    }
}