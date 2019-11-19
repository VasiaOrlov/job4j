package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Class CheckTest.
 * @author Vasiliy Orlov.
 */
public class CheckTest {
    /**
     * Method monoTest1 - test method.
     */
    @Test
    public void monoTest1() {
        Check mono1 = new Check();
        boolean result1 = mono1.mono(new boolean[] {true, true, false, true});
        assertThat(result1, is(false));
    }
    /**
     * Method monoTest1 - test method.
     */
    @Test
    public void monoTest2() {
        Check mono2 = new Check();
        boolean result2 = mono2.mono(new boolean[] {true, true, true});
        assertThat(result2, is(true));
    }
}
