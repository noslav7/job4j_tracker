package ru.job4j.stream;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Analyze {

    public static double averageScore(Stream<Pupil> stream) {
        return  stream
                .flatMap(x -> x.getSubjects().stream())
                .mapToInt(Subject::getScore)
                .average()
                .orElse(0D);
    }

    public static List<Tuple> averageScoreBySubject(Stream<Pupil> stream) {
        return stream
                .map(s -> new Tuple(s.getName(), averageScore(stream)))
                .collect(Collectors.toList());
    }

    public static List<Tuple> averageScoreByPupil(Stream<Pupil> stream) {
        Map<String, Double> map = stream
                .flatMap(x -> x.getSubjects())
                .stream()
                .collect(Collectors.groupingBy(x.getName(), Collectors.averagingDouble(subj -> Double.parseDouble(sc))));
        return map.entrySet()
                .stream()
                .map(x -> new Tuple(x.getKey(), x.getValue()))
                .collect(Collectors.toList());
    }

    public static Tuple bestStudent(Stream<Pupil> stream) {
        return averageScoreBySubject(stream).stream()
                .map(pupil -> new Pupil(pupil.getName(), averageScore(stream)))
                .sum()
                .max(Comparator.comparing())
                .orElse();
    }

    public static Tuple bestSubject(Stream<Pupil> stream) {
        return  averageScoreByPupil(stream).stream()
                .map()
                .max(Comparator.comparing(o -> ))
                .orElse();
    }
}
