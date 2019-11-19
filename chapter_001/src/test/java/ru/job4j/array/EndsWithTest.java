package ru.job4j.array;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Class EndWithTest.
 * @author Vasiliy Orlov.
 */
public class EndsWithTest {
    /**
     * Method endsWithTest - test endWith method.
     */
    @Test
    public void endsWithTest() {
        char[] array1 = {'h', 'e', 'l', 'l', 'o'};
        char[] array2 = {'l', 'o'};
        boolean result1 = EndsWith.endsWith(array1, array2);
        assertThat(result1, is(true));
    }

    /**
     * Method endsWithTest1 - test endWith method.
     */
    @Test
    public void endsWithTest1() {
        char[] array1 = {'h', 'e', 'l', 'l', 'o'};
        char[] array2 = {'L', 'o'};
        boolean result1 = EndsWith.endsWith(array1, array2);
        assertThat(result1, is(false));
    }
}
