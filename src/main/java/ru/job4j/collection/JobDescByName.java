package ru.job4j.collection;

import java.util.Comparator;

public class JobDescByName implements Comparator<Job> {

    @Override
    public int compare(Job o2, Job o1) {
        return o2.getName().compareTo(o1.getName());
    }
}
