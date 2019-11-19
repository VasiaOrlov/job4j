package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Class FindLoopTest.
 * @author Vasiliy Orlov
 */
public class FindLoopTest {
    /**
     * Method indexOfTest1 - test method if value in array
     */
    @Test
    public void indexOfTest1() {
        FindLoop find1 = new FindLoop();
        int result1 = find1.indexOf(new int[] {3, 4, 7, 10, 1}, 7);
        assertThat(result1, is(2));
    }

    /**
     * Method indexOfTest2 - test method if value is not
     */
    @Test
    public void indexOfTest2() {
        FindLoop find2 = new FindLoop();
        int result2 = find2.indexOf(new int[] {3, 4, 7, 10, 1}, 2);
        assertThat(result2, is(-1));
    }
}
