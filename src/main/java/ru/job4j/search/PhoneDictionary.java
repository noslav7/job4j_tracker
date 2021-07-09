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
            for (Person personInfo: persons) {
               if (personInfo.getName().contains(key)
                       || personInfo.getSurname().contains(key)
                       || personInfo.getAddress().contains(key)
                       || personInfo.getPhone().contains(key)) {
                    result.add(personInfo);
                }
            }
            return result;
        }
    }
