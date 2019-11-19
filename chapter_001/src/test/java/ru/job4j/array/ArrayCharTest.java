package ru.job4j.array;
import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Class ArrayCharTest.
 * @author Vasiliy Orlov.
 */
public class ArrayCharTest {
    /**
     * Method startWithTest1 - test method.
     */
    @Test
    public void startWithTest1() {
        ArrayChar yes = new ArrayChar();
        char[] array1 = {'h', 'e', 'l', 'l', 'o'};
        char[] array2 = {'h', 'E'};
        boolean result1 = yes.startWith(array1, array2);
        assertThat(result1, is(false));
    }
    /**
     * Method startWithTest1 - test method.
     */
    @Test
    public void startWithTest2() {
        ArrayChar yes = new ArrayChar();
        char[] array1 = {'h', 'e', 'l', 'l', 'o'};
        char[] array2 = {'h', 'e'};
        boolean result1 = yes.startWith(array1, array2);
        assertThat(result1, is(true));
    }
}
