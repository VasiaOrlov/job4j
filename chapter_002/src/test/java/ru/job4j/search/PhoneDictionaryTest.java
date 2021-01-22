package ru.job4j.search;

import java.util.ArrayList;
import static org.junit.Assert.*;
import static org.hamcrest.core.Is.*;
import org.junit.Test;

public class PhoneDictionaryTest {
    @Test
    public void findTest() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(
                new Person("Petr", "Arsentev", "534872", "Bryansk")
        );
        ArrayList<Person> persons = phones.find("ryan");
        assertThat(persons.get(0).getSurname(), is("Arsentev"));
    }

}