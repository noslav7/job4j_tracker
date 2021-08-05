package ru.job4j.stream;

import java.util.Map;
import java.util.Set;

public class College {
    private final Map<StudentStreamAPI, Set<Subject>> students;

    public College(Map<StudentStreamAPI, Set<Subject>> students) {
        this.students = students;
    }

    public StudentStreamAPI findByAccount(String account) {
        return students.keySet()
                .stream()
                .filter(s -> s.getAccount().equals(account))
                .findFirst()
                .orElse(null);
    }

    public Subject findBySubjectName(String account, String name) {
        StudentStreamAPI a = findByAccount(account);
        if (a != null) {
            return students.get(a)
                    .stream()
                    .filter(s -> s.getName().equals(name))
                    .findFirst()
                    .orElse(null);
        }
        return null;
    }

    public static void main(String[] args) {
        Map<StudentStreamAPI, Set<Subject>> students = Map.of(new StudentStreamAPI
                        ("Student", "000001", "201-18-15"),
                Set.of(
                        new Subject("Math", 70),
                        new Subject("English", 85)
                )
        );
        College college = new College(students);
        StudentStreamAPI student = college.findByAccount("000001");
        System.out.println("Найденный студент: " + student);
        Subject english = college.findBySubjectName("000001", "English");
        System.out.println("Оценка по найденному предмету: " + english.getScore());
    }
}
