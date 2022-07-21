package ru.job4j.map;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class AnalyzeByMap {
    public static double averageScore(List<Pupil> pupils) {
        List<Subject> allPupilsSubjects = pupils.stream()
                .map(Pupil::getSubjects)
                .flatMap(Collection::stream)
                .toList();
        double scoresSum = allPupilsSubjects.stream()
                .mapToInt(Subject::getScore)
                .sum();
        double scoresNumber = allPupilsSubjects.stream().count();
        return scoresSum / scoresNumber;
    }

    public static List<Label> averageScoreBySubject(List<Pupil> pupils) {
        List<Subject> allPupilsSubjects = pupils.stream()
                .map(Pupil::getSubjects)
                .flatMap(Collection::stream)
                .toList();
        List<String> distinctSubjects = allPupilsSubjects.stream()
                .map(Subject::getName)
                .distinct()
                .toList();
        List<Label> labels = new ArrayList<>();
        for (int i = 0; i < distinctSubjects.size(); i++) {
            String name = "";
            double quantityScores = 0D;
            double scoresSum = 0D;
            for (int j = 0; j < allPupilsSubjects.size(); j++) {
                if (distinctSubjects.get(i).equals(allPupilsSubjects.get(j).getName())) {
                    name = allPupilsSubjects.get(j).getName();
                    scoresSum += (double) allPupilsSubjects.get(j).getScore();
                    quantityScores++;
                }
            }
        labels.add(new Label(name, (double) scoresSum / quantityScores));
        }
        return labels;
    }

    public static List<Label> averageScoreByPupil(List<Pupil> pupils) {
        return List.of();
    }

    public static Label bestStudent(List<Pupil> pupils) {
        return null;
    }

    public static Label bestSubject(List<Pupil> pupils) {
        return null;
    }
}
