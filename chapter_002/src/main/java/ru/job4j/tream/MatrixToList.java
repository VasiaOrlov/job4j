package ru.job4j.tream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MatrixToList {

    public List<Integer> flatMap(Integer[][] list) {
        return Stream.of(list)
                .flatMap(Stream::of)
                .collect(Collectors.toList());
    }
}
