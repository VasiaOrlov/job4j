package ru.job4j.lambda;

import java.util.Comparator;

public class Attachment {
    private String name;
    private int size;

    public Attachment(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    static Comparator<Attachment> comparator = new Comparator<Attachment>() {
        @Override
        public int compare(Attachment o1, Attachment o2) {
            return o1.getName().compareTo(o2.getName());
        }
    };

    @Override
    public String toString() {
        return "{"
                + "name='" + name + '\''
                + ", size=" + size
                + '}';
    }

    public static void main(String[] args) {
        Attachment first = new Attachment("Vas", 1);
        Attachment second = new Attachment("Alex", 2);
        System.out.println(comparator.compare(first, second));
    }
}