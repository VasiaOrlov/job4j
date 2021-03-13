package ru.job4j.tream;

import java.util.List;
import java.util.stream.Collectors;

public class MatrixToList {

    public List<Integer> flatMap(List<List<Integer>> list) {
        return list.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());
    }
}
