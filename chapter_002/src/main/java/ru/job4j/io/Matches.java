package ru.job4j.io;

import java.util.Scanner;

/**
 * Class Mathes - игра в убери все спички.
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
            if (i % 2 != 0) {
                System.out.println("Ход первого игрока. Сколько спичек убираем?");
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
            } else {
                System.out.println("Ход второго игрока. Сколько спичек убираем?");
                match = Integer.valueOf(input.nextLine());
                if (match < 1 || match > 3) {
                    System.out.println("Введите число от 1 до 3.");
                    for (; match < 4 && match > 0;) {
                        match = Integer.valueOf(input.nextLine());
                    }
                } else {
                    value -= match;
                    i++;
                    System.out.println("На столе лежит спечек - " + value);
                }
            }
        }
        if (i % 2 == 0) {
            System.out.println("Победил первый игрок");
        } else {
            System.out.println("Победил второй игрок");
        }
    }
}
