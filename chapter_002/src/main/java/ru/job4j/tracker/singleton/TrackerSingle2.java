package ru.job4j.tracker.singleton;

import ru.job4j.tracker.Tracker;

public class TrackerSingle2 {
    private static final Tracker VALUE = new Tracker();

    private TrackerSingle2() { }

    public static Tracker getVALUE() {
        return VALUE;
    }

    public static void main(String[] args) {
        Tracker tracker = TrackerSingle2.getVALUE();
    }
}