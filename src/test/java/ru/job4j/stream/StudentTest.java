package ru.job4j.stream;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class StudentTest {

    @Test
    public void whenCollectClassV() {
        List<Student> students = List.of(
                new Student(3, "Surname1"),
                new Student(3, "Surname1"),
                new Student(4, "Surname2"),
                new Student(4, "Surname2"),
                new Student(5, "Surname3"),
                new Student(5, "Surname3")
        );
        Map<String, Student> map = new HashMap<>();
        map = students.collect(students);
        map.put("Surname1", new Student(3, "Surname1"));
        map.put("Surname2", new Student(4, "Surname2"));
        map.put("Surname3", new Student(5, "Surname3"));
        assertThat(?);
    }
}