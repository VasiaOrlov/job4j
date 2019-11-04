package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int value) {
        return value / 70;
    }
    public  static int rubleToDollar(int value) {
        return value / 60;
    }
    public static int euroToRuble(int value) {
        return value * 70;
    }
    public  static int dollarToRuble(int value) {
        return value * 60;
    }
    public static void main(String[] args) {
        int euro = rubleToEuro(140);
        System.out.println("140 rubles are " + euro + "euro.");
        int dollar = rubleToDollar(120);
        System.out.println("120 rubles are " + dollar + "dollar.");
        int ruble = euroToRuble(3);
        System.out.println("3 euro are " + ruble + "rubles.");
        int ruble1 = dollarToRuble(3);
        System.out.println("3 dollar are " + ruble1 + "rubles.");

        int in1 = 140;
        int exp1 = 2;
        int out1 = rubleToEuro(in1);
        boolean passed1 = exp1 == out1;
        System.out.println("140 rubles are 2 euro. Test result :" + passed1);

        int in2 = 120;
        int exp2 = 2;
        int out2 = rubleToDollar(in2);
        boolean passed2 = exp1 == out2;
        System.out.println("120 rubles are 2 dollar. Test result :" + passed2);

        int in3 = 4;
        int exp3 = 280;
        int out3 = euroToRuble(in3);
        boolean passed3 = exp3 == out3;
        System.out.println("4 euro are 280 rubles. Test result :" + passed3);

        int in4 = 5;
        int exp4 = 300;
        int out4 = dollarToRuble(in4);
        boolean passed4 = exp4 == out4;
        System.out.println("5 dollars are 300 rubles. Test result :" + passed4);
    }
}
