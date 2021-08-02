package ru.job4j.stream;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class Student {
        private int score;
        private String surname;

        public Student(int score, String surname) {
            this.score = score;
            this.surname = surname;
        }

        public int getScore() {
            return score;
        }

        public String getSurname() {
            return surname;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            Student student = (Student) o;
            return score == student.score
                    && Objects.equals(surname, student.surname);
        }

        @Override
        public int hashCode() {
            return Objects.hash(score, surname);
        }

        public Map<String, Student> collect(List<Student> students) {
             return students.stream()
                     .distinct()
                     .collect(
                             Collectors.toMap(
                                     surname -> getSurname(),
                                     Student -> Student
                             ));
        }
}
