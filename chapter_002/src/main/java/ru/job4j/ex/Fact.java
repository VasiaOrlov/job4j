package ru.job4j.ex;

public class Fact {
    public static void main(String[] args) {
        Fact win = new Fact();
        System.out.println(win.calc(5));
        System.out.println(win.calc(-2));
    }

    public int calc(int n) {
        if (n < 0) {
                throw new IllegalArgumentException("Введите число большее или равное 0.");
        }
        int rsl = 1;
        for (int index = 1; index <= n; index++) {
            rsl *= index;
        }
        return rsl;
    }
}