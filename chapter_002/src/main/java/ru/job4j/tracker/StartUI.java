package ru.job4j.tracker;

import java.util.Scanner;

public class StartUI {
    public void init(Scanner scanner, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            int value = Integer.valueOf(scanner.nextLine());
            if (value == 0) {
                System.out.println("Введите имя заявки");
                tracker.add(new Item(scanner.nextLine()));
            } else if (value == 1) {
                Item[] result = tracker.findAll();
                System.out.println("Список заявок:");
                for (int index = 0; index < result.length; index++) {
                    System.out.println(index + ". " + result[index].getName() + ", id = " + result[index].getId());
                }
            } else if (value == 2) {
                System.out.println("Введите id, введите новое имя");
                System.out.println(tracker.replace(scanner.nextLine(), new Item(scanner.nextLine())));
            } else if (value == 3) {
                System.out.println("Ведите id заявки чтобы удалить:");
                System.out.println(tracker.delete(scanner.nextLine()));
            } else if (value == 4) {
                System.out.println("Введите id чтобы найти заявку:");
                System.out.println(tracker.findById(scanner.nextLine()).getName());
            } else if (value == 5) {
                System.out.println("Введите имя заявки");
                Item[] result = tracker.findByName(scanner.nextLine());
                System.out.println("Список заявок:");
                for (int index = 0; index < result.length; index++) {
                    System.out.println(index + ". " + result[index].getName() + ", id = " + result[index].getId());
                }
            } else if (value == 6) {
                System.out.println("Досвидания");
                run = false;
            } else {
                System.out.println("Введите значение от 0 до 6.");
            }
        }
    }
    private void showMenu() {
        System.out.println("Menu.");
        System.out.println("0. Add new Item");
        System.out.println("1. Show all items");
        System.out.println("2. Edit item");
        System.out.println("3. Delete item");
        System.out.println("4. Find item by Id");
        System.out.println("5. Find items by name");
        System.out.println("6. Exit Program");
        System.out.println("Select: ");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        new StartUI().init(scanner, tracker);
    }
}
