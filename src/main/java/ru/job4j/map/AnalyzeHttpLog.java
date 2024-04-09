package ru.job4j.map;

import com.google.common.collect.ImmutableMap;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AnalyzeHttpLog {
    public record Line(String level, String thread, String text) {}

    public static Map<String, Long> groupByLevel(List<Line> logs) {
        return ImmutableMap.copyOf(logs.stream()
                .sorted(Comparator.comparing(Line::level))
                .collect(Collectors.groupingBy(Line::level, Collectors.counting())));
    }

    public static String maxByThread(List<Line> logs) {
        return logs.stream()
                .collect(Collectors.groupingBy(Line::thread, Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse("");
    }

    public static Map<String, Long> detailByThread(List<Line> logs, String thread,
                                                   List<String> orders) {
        return ImmutableMap.copyOf(logs.stream()
                .filter(log -> log.thread().equals(thread))
                .filter(log -> orders.contains(log.level()))
                .sorted(Comparator.comparing(Line::level))
                .collect(Collectors.groupingBy(Line::level, Collectors.counting())));
    }
}
