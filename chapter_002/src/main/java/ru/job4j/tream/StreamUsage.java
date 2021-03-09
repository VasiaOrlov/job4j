package ru.job4j.tream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamUsage {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, -5, 7, -6, 3);
        List<Integer> filterList = list.stream().filter(
                value -> value > 0
        ).collect(Collectors.toList());
        filterList.forEach(System.out::println);
    }
}
