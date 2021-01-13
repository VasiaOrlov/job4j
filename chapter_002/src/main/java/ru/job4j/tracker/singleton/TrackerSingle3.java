package ru.job4j.tracker.singleton;

import ru.job4j.tracker.Tracker;

public class TrackerSingle3 {
    private TrackerSingle3() {
    }

    public static Tracker getTracker() {
        return Holder.VALUE;
    }

    private static final class Holder {
        private static final Tracker VALUE = new Tracker();
    }

    public static void main(String[] args) {
        Tracker tracker = TrackerSingle3.getTracker();
    }
}