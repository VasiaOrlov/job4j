package ru.job4j.array;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Class MinTest.
 * @author Vasiliy Orlov.
 */
public class MinDiapasonTest {
    /**
     * findMinTest - test method.
     */
    @Test
    public void findMinTest() {
        int result = MinDiapason.findMin(new int[] {1, 3, 2, 10, -4, 4}, 2, 4);
        assertThat(result, is(-4));
    }

    /**
     * findMinTest2 - test method.
     */
    @Test
    public void findMinTest2() {
        int result = MinDiapason.findMin(new int[] {1, 3, 2, 10, 4, 4}, 3, 5);
        assertThat(result, is(4));
    }
}