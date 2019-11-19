package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

/**
 * Class TurnTest
 * @author Vasiliy Orlov
 */
public class TurnTest {
    /**
     * Method backTest1 - test method
     */
    @Test
    public void backTest1() {
        Turn turner = new Turn();
        int[] input = new int[] {4, 1, 6, 2};
        int[] result = turner.back(input);
        int[] expect = new int[] {2, 6, 1, 4};
        assertThat(result, is(expect));
    }
    /**
     * Method backTest2 - test method
     */
    @Test
    public void backTest2() {
        Turn turner1 = new Turn();
        int[] input1 = new int[] {1, 2, 3, 4, 5};
        int[] result1 = turner1.back(input1);
        int[] expect1 = new int[] {5, 4, 3, 2, 1};
        assertThat(result1, is(expect1));
    }
}
