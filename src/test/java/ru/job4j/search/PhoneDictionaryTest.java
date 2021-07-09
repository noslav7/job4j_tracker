package ru.job4j.search;

import org.junit.Test;
import ru.job4j.collection.Person;

import java.util.ArrayList;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class  PhoneDictionaryTest {

    @Test
    public void findByName() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(
                new Person("Petr", "Arsentev", "534872", "Bryansk")
        );
        ArrayList<Person> persons = phones.find("Petr");
        assertThat(persons.get(0).getSurname(), is("Arsentev"));
    }

    @Test
    public void findName() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(
                new Person("Alexander", "Kovalenko", "123456", "Perm")
        );
        ArrayList<Person> persons = phones.find("Petr");
        assertTrue(persons.isEmpty());
    }
}