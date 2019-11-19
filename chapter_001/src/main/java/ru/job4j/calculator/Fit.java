package ru.job4j.calculator;

/**
 * Class Fit.
 * @author Vasiliy Orlov (ov_prog@mail.ru).
 */

public class Fit {

    /**
     * Method manWeight.
     * @param height - height man.
     * @return  - weight man.
     */
    public static double manWeight(double height) {
        return (height - 100) * 1.15;
    }

    /**
     * Method womanWeight.
     * @param height - height woman.
     * @return - weight woman.
     */

    public static double womanWeight(double height) {
        return (height - 110) * 1.15;
    }

    /**
     * Method main.
     * @param args - args.
     */
    public static void main(String[] args) {
        double man = manWeight(180);
        System.out.println("Man 180 is " + man);
        double woman = womanWeight(170);
        System.out.println("Woman 170 is " + woman);
    }
}
