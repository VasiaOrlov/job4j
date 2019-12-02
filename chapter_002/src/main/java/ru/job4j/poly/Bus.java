package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void go() {
        System.out.println("Осторожно, начинаем движение!");
    }

    @Override
    public void passenger(int value) {
        int cash = value * 50;
        System.out.println("Водитель заработал " + cash + "рублей");
    }

    @Override
    public int fillUp(int fuel) {
        int result = fuel * 42;
        return result;
    }
}
