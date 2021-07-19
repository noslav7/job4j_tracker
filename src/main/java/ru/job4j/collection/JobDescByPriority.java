package ru.job4j.collection;

import java.util.Comparator;

public class JobDescByPriority implements Comparator<Job> {

    @Override
    public int compare(Job o2, Job o1) {
        return Integer.compare(o2.getPriority(), o1.getPriority());
    }
}
