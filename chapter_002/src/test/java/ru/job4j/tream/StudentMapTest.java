package ru.job4j.tream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import org.junit.Test;

import java.util.List;
import java.util.Map;

public class StudentMapTest {
    @Test
    public void inMapTest() {
        StudentMap studentMap = new StudentMap();
        List<Student> list = List.of(
                new Student(70, "Petr"),
                new Student(60, "Misha"),
                new Student(70, "Petr")
        );
        Map<String, Student> rsl = studentMap.inMap(list);
        Map<String, Student> expect = Map.of(
                "Petr", new Student(70, "Petr"),
                "Misha", new Student(60, "Misha")
                );
        assertThat(expect, is(rsl));
    }
}