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
        List<Subject> distinctSubjects = allPupilsSubjects.stream()
                .distinct()
                .toList();
        List<Label> labels = new ArrayList<>();
        double quantityScores = 0;
        double scoresSum = 0;
        for (int i = 0; i < distinctSubjects.size(); i++) {
            for (int j = 0; j < allPupilsSubjects.size(); j++) {
                if (distinctSubjects.get(i).equals(allPupilsSubjects.get(j))) {
                    scoresSum += allPupilsSubjects.get(j).getScore();
                    quantityScores++;
                }
            }
        labels.add(new Label(distinctSubjects.get(i).getName(), scoresSum / quantityScores));
            scoresSum = 0;
            quantityScores = 0;
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
