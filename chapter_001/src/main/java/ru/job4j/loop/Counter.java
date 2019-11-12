package ru.job4j.loop;

public class Counter {
    public int add(int start, int finish) {
        int sum = 0;
        for (int value = start; value <= finish; value++) {
            if (value%2 == 0) sum += value;
        }
        return sum;
    }
}
