package ru.job4j.map;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class  AnalyzeByMap {
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
  /*      List<Subject> allPupilsSubjects = pupils.stream()
                .map(Pupil::getSubjects)
                .flatMap(Collection::stream)
                .toList();
        List<Subject> distinctSubjects = allPupilsSubjects.stream()
                .distinct()
                .toList();
        List<Subject> secondDistinctList = new ArrayList<>();
        secondDistinctList.stream()
                .forEach(subject -> subject.setScore(0));
        for (int i = 0; i < allPupilsSubjects.size(); i++) {
            for (int j = 0; j < distinctSubjects.size(); j++) {
                if (allPupilsSubjects.get(i).equals(distinctSubjects.get(j))) {
                secondDistinctList.get(j).score += allPupilsSubjects.get(i).score;
                }
            }
        }*/
        return List.of();
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
