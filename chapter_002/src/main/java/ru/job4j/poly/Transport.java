package ru.job4j.poly;

public interface Transport {
    void go();

    void passenger(int value);

    int fillUp(int fuel);
}
