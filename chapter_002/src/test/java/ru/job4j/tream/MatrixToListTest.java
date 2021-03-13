package ru.job4j.tream;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;
import org.junit.Test;
import java.util.List;

public class MatrixToListTest {

    @Test
    public void flatMapTest() {
        Integer[][] matrix = {{1, 2}, {3, 4}};
        MatrixToList matrixToList = new MatrixToList();
        List<Integer> expect = matrixToList.flatMap(matrix);
        List<Integer> rsl = List.of(1, 2, 3, 4);
        assertThat(expect, is(rsl));
    }
}