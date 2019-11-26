package ru.job4j.oop;

public class Battery {
    private int load;
    public void exchanger(Battery another) {
        another.load += this.load;
        this.load = 0;
    }
    public static void main(String[] args) {
        Battery one = new Battery();
        one.load = 15;
        Battery two = new Battery();
        two.load = 20;
        one.exchanger(two);
        System.out.println("charge bat two = " + two.load);
    }
}
