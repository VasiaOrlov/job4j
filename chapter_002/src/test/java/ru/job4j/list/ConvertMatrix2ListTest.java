package ru.job4j.list;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.*;
import org.junit.Test;
import java.util.List;
import java.util.Arrays;

public class ConvertMatrix2ListTest {

    @Test
    public void testToList() {
        ConvertMatrix2List list = new ConvertMatrix2List();
        int[][] input = {
                {1, 2},
                {3, 4}
        };
        List<Integer> expect = Arrays.asList(
                1, 2, 3, 4
        );
        List<Integer> result = list.toList(input);
        assertThat(result, is(expect));
    }
}