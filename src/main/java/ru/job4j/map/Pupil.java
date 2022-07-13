package ru.job4j.map;

import java.util.List;

public class Pupil {
    private String name;

    private List<Subject> subjects;

    public Pupil(String name, List<Subject> subjects) {
        this.name = name;
        this.subjects = subjects;
    }
}
