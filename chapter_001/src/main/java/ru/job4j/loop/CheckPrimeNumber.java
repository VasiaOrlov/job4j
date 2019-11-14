package ru.job4j.loop;

public class CheckPrimeNumber {
    public boolean check(int num) {
        boolean prime = true;
        for (int x = 2; x < num; x++) {
            if ((num % x) == 0) {
                prime = false;
                break;
            }
        }
        return prime;
    }
}