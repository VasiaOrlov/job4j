package ru.job4j.io;

import java.util.Scanner;

/**
 * Class Mathes - игра в убери все спички.
 *
 * @author Vasiliy Orlov.
 */
public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int value = 11;
        System.out.println("На столе лежит спичек - " + value);
        int match;
        int i = 1;
        while (value > 0) {
            String player = i % 2 != 0 ? "первого" : "второго";
            System.out.println(String.format("Ход %s игрока. Сколько спичек убираем?", player));
            match = Integer.valueOf(input.nextLine());
            if (match < 1 || match > 3) {
                System.out.println("Введите число от 1 до 3.");
                for (; match < 4 && match > 0;) {
                    match = Integer.valueOf(input.nextLine());
                }
            } else {
                value -= match;
                i++;
                System.out.println("На столе лежит спичек - " + value);
            }
        }
        String player = i % 2 == 0 ? "первый" : "второй";
        System.out.println(String.format("Победил %s игрок", player));
    }
}
