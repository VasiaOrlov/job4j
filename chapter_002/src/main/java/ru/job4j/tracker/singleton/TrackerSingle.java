package ru.job4j.tracker.singleton;


public enum TrackerSingle {
    INSTANCE;

    public static void main(String[] args) {
        TrackerSingle tracker = TrackerSingle.INSTANCE;
    }
}


class TrackerSingle1 {
    private static TrackerSingle1 instance;
    private TrackerSingle1() { }

    public static TrackerSingle1 getInstance() {
        if (instance == null) {
            instance = new TrackerSingle1();
        }
        return instance;
    }

    public static void main(String[] args) {
        TrackerSingle1 tracker = TrackerSingle1.getInstance();
    }

}

class TrackerSingle2 {
    private static final TrackerSingle2 INSTANCE = new TrackerSingle2();
    private TrackerSingle2() { }

    public static TrackerSingle2 getInstance() {
        return INSTANCE;
    }

    public static void main(String[] args) {
        TrackerSingle2 tracker = TrackerSingle2.getInstance();
    }
}

class TrackerSingle4 {
    private TrackerSingle4() {
    }

    public static TrackerSingle4 getInstance() {
        return Holder.INSTANCE;
    }

    private static final class Holder {
        private static final TrackerSingle4 INSTANCE = new TrackerSingle4();
    }

    public static void main(String[] args) {
        TrackerSingle4 tracker = TrackerSingle4.getInstance();
    }
}




