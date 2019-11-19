package ru.job4j.array;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Class MinTest.
 * @author Vasiliy Orlov.
 */
public class MinTest {
    /**
     * findMinTest - test method.
     */
    @Test
    public void findMinTest() {
        int result = Min.findMin(new int[] {1, 3, 2, 10, -4, 4});
        assertThat(result, is(-4));
    }

    /**
     * findMinTest2 - test method.
     */
    @Test
    public void findMinTest2() {
        int result = Min.findMin(new int[] {1, 3, 2, 10, 4, 4});
        assertThat(result, is(1));
    }
}
