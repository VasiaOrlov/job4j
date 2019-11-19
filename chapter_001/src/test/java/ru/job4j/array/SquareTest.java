package ru.job4j.array;
import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Class SquareTest.
 * @author Vasiliy Orlov.
 */
public class SquareTest {
    /**
     * Method calculateTest1 - test method.
     */
    @Test
    public void calculateTest1() {
        Square array = new Square();
        int[] result1 = array.calculate(4);
        assertThat(result1, is(new int[] {1, 4, 9, 16}));
    }
}
