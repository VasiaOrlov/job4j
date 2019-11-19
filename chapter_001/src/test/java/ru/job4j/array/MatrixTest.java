package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Class MatrixTest.
 * @author Vasiliy Orlov.
 */
public class MatrixTest {
    /**
     * Method multipleTest - test method multiple.
     */
    @Test
    public void multipleTest() {
        int[][] result = Matrix.multiple(3);
        assertThat(result, is(new int[][] {
                {1, 2, 3},
                {2, 4, 6},
                {3, 6, 9}
        }));
    }
}
