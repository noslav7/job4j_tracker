package ru.job4j.stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Analyze {
/*
    public static double averageScore(Stream<Pupil> stream) {
        return  Stream.of()
                .flatMap(x -> x.getSubjects()
                        .stream());
                .mapToInt(s -> stream.map(sub -> ))
                .average()
                .orElse(0D);
    }

    public static List<Tuple> averageScoreBySubject(Stream<Pupil> stream) {
        return Stream.of(stream)
                .map(s -> a (t -> new Tuple()))
                .average()
                .collect(Collectors.toList());
    }

    public static List<Tuple> averageScoreByPupil(Stream<Pupil> stream) {
        Map<String, Double> map = stream.flatMap(x -> x.getSubjects()
                .stream()
                .collect(Collectors.groupingBy(x.getName(), Collectors.averagingDouble())));
        return map.entrySet()
                .stream()
                .map(x -> new Tuple(x.getKey(), x.getValue()))
                .collect(Collectors.toList());
    }

    public static Tuple bestStudent(Stream<Pupil> stream) {
        return Stream.of(stream)
                .map(s -> a (t -> new Tuple()))
                .sum()
                .max();
    }

    public static Tuple bestSubject(Stream<Pupil> stream) {
        return Stream.of()
                .flatMap()
                .collect(Collectors.groupingBy().summingDouble())
                .entrySet()
                .stream()
                .map(Map.Entry.getKey(), Map.Entry.getValue())
                .max();
    }*/
}
