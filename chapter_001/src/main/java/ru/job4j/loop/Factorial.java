package ru.job4j.loop;

public class Factorial {
    public int calc(int n) {
        int result = 1;
        for (int value = 1; value <= n; value++) {
            result *= value;
        }
        return result;
    }
}
