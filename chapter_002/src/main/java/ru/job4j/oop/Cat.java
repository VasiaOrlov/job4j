package ru.job4j.oop;

public class Cat {
    private String food;
    private String name;

    public void show() {
        System.out.println(this.food);
        System.out.println(this.name);
    }

    void eat(String meat) {
        this.food = meat;
    }

    public void giveNick(String nick) {
        this.name = nick;
    }

    public static void main(String[] args) {
        System.out.println("it's food and name first cat:");
        Cat black = new Cat();
        black.eat("kotleta");
        black.giveNick("black");
        black.show();
        System.out.println("it's food and name second cat:");
        Cat gav = new Cat();
        gav.eat("fish");
        gav.giveNick("gav");
        gav.show();
    }
}
