package ru.job4j.io;

import java.util.Random;
import java.util.Scanner;

/**
 * Class MagicBall.
 * @author Vasiliy Orlov.
 */
public class MagicBall {
    public static void main(String[] args) {
        Scanner question = new Scanner(System.in);
        System.out.print("Я великий Оракул. Что ты хочешь узнать? ");
        question.nextLine();
        int value = new Random().nextInt(3);
        switch (value) {
            case 0:
                System.out.println("Yes.");
                break;
            case 1:
                System.out.println("No.");
                break;
            default:
                System.out.println("May be.");
        }

    }
}
