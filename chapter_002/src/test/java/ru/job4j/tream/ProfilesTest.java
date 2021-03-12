package ru.job4j.tream;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;

public class ProfilesTest {
    @Test
    public void collectTest() {
        List<Profile> list = Arrays.asList(
                new Profile(new Address("Moscow", "Green", 1, 5)),
                new Profile(new Address("Moscow", "Red", 1, 3)),
                new Profile(new Address("Kirov", "Blue", 25, 53))
        );
        Profiles profiles = new Profiles();
        List<Address> result = profiles.collect(list);
        List<Address> expect = Arrays.asList(
                new Address("Moscow", "Green", 1, 5),
                new Address("Moscow", "Red", 1, 3),
                new Address("Kirov", "Blue", 25, 53)
        );
        assertThat(expect, is(result));
    }

}