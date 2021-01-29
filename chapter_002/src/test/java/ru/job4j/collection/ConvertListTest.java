package ru.job4j.collection;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.*;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class ConvertListTest {

    @Test
    public void testConvert() {
        List<int[]> in = new ArrayList<>();
        in.add(new int[] {1});
        in.add(new int[] {2, 3});
        List<Integer> expect = Arrays.asList(1, 2, 3);
        assertThat(ConvertList.convert(in), is(expect));
    }
}