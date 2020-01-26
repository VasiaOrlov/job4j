package ru.job4j.ex;

public class FactRec {
    public static int calc(int n) {
        if (n > 1) {
            return calc(n - 1) * n;
        } else if (n == 1) {
            return 1;
        } else {
            throw new IllegalArgumentException("Число должно быть больше 0.");
        }
    }

    public static void main(String[] args) {
        int rsl = calc(3);
        System.out.println(rsl);
    }
}
