package ru.job4j.tream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.Map;

public class StudentMap {

    public Map<String, Student> inMap(List<Student> list) {
        return list.stream()
                .distinct()
                .collect(
                        Collectors.toMap(
                                Student::getName,
                                e -> e
                        )
                );
    }
}