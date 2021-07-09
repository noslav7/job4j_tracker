package ru.job4j.search;

import ru.job4j.collection.Person;

import java.util.ArrayList;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<>();

    public void add(Person person) {
        this.persons.add(person);
    }

       public ArrayList<Person> find(String key) {
            ArrayList<Person> result = new ArrayList<>();
            for (Person id: persons) {
                String stringId = id.toString();
                boolean contains = stringId.contains(key);
                if (contains) {
                    result.add(id);
                }
            }
            return result;
        }
    }
