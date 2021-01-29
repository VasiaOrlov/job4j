package ru.job4j.collection;

import java.util.HashSet;

public class UsageHashSet {
    public static void main(String[] args) {
        HashSet<String> autos = new HashSet<>();
        autos.add("BMW");
        autos.add("VOLVO");
        autos.add("LADA");
        autos.add("TOYOTA");
        for (String e : autos) {
            System.out.println(e);
        }
    }
}
