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
                .flatMap(pupil -> pupil.getSubjects().stream())
                .collect(Collectors.groupingBy(Subject::getName,
                        Collectors.averagingDouble(subj -> Double.parseDouble(subj.getScore() + ""))));
        return map.entrySet()
                .stream()
                .map(x -> new Tuple(x.getKey(), x.getValue()))
                .collect(Collectors.toList());
    }

    public static Tuple bestStudent(Stream<Pupil> stream) {
        return stream
                .flatMap(pupil -> pupil.getSubjects().stream())
                .mapToInt(Subject::getScore)
                .sum()
                .max(Comparator.comparingInt(sum -> (int) sum))
                .orElse();
    }

    public static Tuple bestSubject(Stream<Pupil> stream) {
        return  stream
                .map(Collectors.groupingBy(Subject::getScore,
                        Collectors.summingDouble(score -> (double) score)))
                .max(Comparator.comparingDouble(score -> (double) score))
                .orElse();
    }
}
