package ru.job4j.oop;

public class Animal {
    private String name;
    public Animal(String name) {
        super();
        this.name = name;
        System.out.println("load Animal");
        System.out.println(name);
    }

    public Animal() {
        System.out.println("Reload constructor");
    }
    public static void main(String[] args) {
        Tiger tiger = new Tiger("Simba");
        System.out.println();
        Tiger tiger1 = new Tiger();
    }
}
