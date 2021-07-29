package ru.job4j.search;

import ru.job4j.collection.Person;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<>();

    public void add(Person person) {
        this.persons.add(person);
    }

    public ArrayList<Person> find(String key) {
        Predicate<Person> combine = (s) -> s.getName().contains(key);
        Predicate<Person> compareSurname = (s) -> s.getSurname().contains(key);
        Predicate<Person> comparePhone = (s) -> s.getPhone().contains(key);
        Predicate<Person> compareAddress = (s) -> s.getAddress().contains(key);
        Predicate<Person> general = (combine).or(compareSurname).
                or(comparePhone).or(compareAddress);

        ArrayList<Person> result = new ArrayList<>();
        for (Person person : persons) {
            if (general.test(person)) {
                result.add(person);
            }
        }
        return result;
    }
    }
