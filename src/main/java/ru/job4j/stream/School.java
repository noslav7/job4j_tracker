package ru.job4j.stream;
import java.util.List;
import java.util.function.Predicate;

        public class School {

            public List<Student> collect(List<Student> students, Predicate<Student> predict) {

                students.stream()
                        .filter(score -> score.getScore() >= 70)
                        .map (student -> student.getScore() + " " + student.getSurname());

                students.stream()
                        .filter(score -> score.getScore() >= 50 && score.getScore() < 70)
                        .map (student -> student.getScore() + " " + student.getSurname());

                students.stream()
                        .filter(score -> score.getScore() < 50)
                        .map (student -> student.getScore() + " " + student.getSurname());

                return students;
    }
}
