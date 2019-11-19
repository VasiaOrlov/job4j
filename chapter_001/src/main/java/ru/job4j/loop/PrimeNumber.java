package ru.job4j.loop;

public class PrimeNumber {
    public int calc(int finish) {
        int count = 1;
        for (int value = 2; value <= finish; value++) {
            for (int x = 2; x < value; x++) {
                if ((value % x) == 0 && x <= Math.sqrt(value)) {
                    break;
                } else if ((value % x) != 0 && x >= Math.sqrt(value)) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}
