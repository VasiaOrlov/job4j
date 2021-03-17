package ru.job4j.collection;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.core.Is.*;
import java.util.List;

public class ConvertList2ArrayTest {
    @Test
    public void testToArray() {
        int[][] result = ConvertList2Array.toArray(List.of(1, 2, 3, 4, 5, 6, 7), 3);
        int[][] expect = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 0, 0}
        };
        assertThat(result, is(expect));
    }
}