package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book first = new Book("Kolobok", 200);
        Book second = new Book("Alisa", 300);
        Book third = new Book("Neznayka", 150);
        Book fourth = new Book("Clean code", 95);

        Book[] archive = new Book[4];
        archive[0] = first;
        archive[1] = second;
        archive[2] = third;
        archive[3] = fourth;

        for (int index = 0; index < archive.length; index++) {
            Book bk = archive[index];
            System.out.println(bk.getName() + " - " + bk.getPages());
        }

        Book dump = archive[0];
        archive[0] = archive[3];
        archive[3] = dump;

        System.out.println();

        for (Book bk : archive) {
            System.out.println(bk.getName() + " - " + bk.getPages());
        }

        System.out.println();

        for (Book bk : archive) {
            if (bk.getName().equals("Clean code")) {
                System.out.println(bk.getName() + " - " + bk.getPages());
            }
        }
    }
}
