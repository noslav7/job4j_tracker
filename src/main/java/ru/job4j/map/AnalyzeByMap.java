package ru.job4j.map;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class AnalyzeByMap {
    public static double averageScore(List<Pupil> pupils) {
        List<Subject> allPupilsSubjects = pupils.stream()
                .map(Pupil::subjects)
                .flatMap(Collection::stream)
                .toList();
        double scoresSum = allPupilsSubjects.stream()
                .mapToInt(Subject::score)
                .sum();
        double scoresNumber = allPupilsSubjects.stream().count();
        return scoresSum / scoresNumber;
    }

    public static List<Label> averageScoreBySubject(List<Pupil> pupils) {
        List<Subject> allPupilsSubjects = pupils.stream()
                .map(Pupil::subjects)
                .flatMap(Collection::stream)
                .toList();
        List<String> distinctSubjects = allPupilsSubjects.stream()
                .map(Subject::name)
                .distinct()
                .toList();
        List<Label> labels = new ArrayList<>();
        for (int i = 0; i < distinctSubjects.size(); i++) {
            String name = "";
            double quantityScores = 0D;
            double scoresSum = 0D;
            for (int j = 0; j < allPupilsSubjects.size(); j++) {
                if (distinctSubjects.get(i).equals(allPupilsSubjects.get(j).name())) {
                    name = allPupilsSubjects.get(j).name();
                    scoresSum += (double) allPupilsSubjects.get(j).score();
                    quantityScores++;
                }
            }
            labels.add(new Label(name, (double) scoresSum / quantityScores));
        }
        return labels;
    }

    public static List<Label> averageScoreByPupil(List<Pupil> pupils) {
        List<Label> avgScoresLabels = new ArrayList<>();
        for (int i = 0; i < pupils.size(); i++) {
            double sum = 0;
            int quantitySubjects = 0;
            for (int pupilIndex = 0; pupilIndex < pupils.get(i).subjects().size(); pupilIndex++) {
                sum += pupils.get(i).subjects().get(pupilIndex).score();
                quantitySubjects++;
                }
            avgScoresLabels.add(new Label(pupils.get(i).name(), sum / quantitySubjects));
            }
        return avgScoresLabels;
    }

    public static Label bestStudent(List<Pupil> pupils) {
        List<Label> sumsScoresLabels = new ArrayList<>();
        for (int i = 0; i < pupils.size(); i++) {
            double sum = 0;
            for (int pupilIndex = 0; pupilIndex < pupils.get(i).subjects().size(); pupilIndex++) {
                sum += pupils.get(i).subjects().get(pupilIndex).score();
            }
            sumsScoresLabels.add(new Label(pupils.get(i).name(), sum));
        }
        sumsScoresLabels.sort(Comparator.naturalOrder());
        return sumsScoresLabels.get(sumsScoresLabels.size() - 1);
    }

    public static Label bestSubject(List<Pupil> pupils) {
        List<Subject> allPupilsSubjects = pupils.stream()
                .map(Pupil::subjects)
                .flatMap(Collection::stream)
                .toList();
        List<String> distinctSubjects = allPupilsSubjects.stream()
                .map(Subject::name)
                .distinct()
                .toList();
        List<Label> sumsBySubject = new ArrayList<>();
        for (int i = 0; i < distinctSubjects.size(); i++) {
            String name = "";
            double scoresSum = 0D;
            for (int j = 0; j < allPupilsSubjects.size(); j++) {
                if (distinctSubjects.get(i).equals(allPupilsSubjects.get(j).name())) {
                    name = allPupilsSubjects.get(j).name();
                    scoresSum += (double) allPupilsSubjects.get(j).score();
                }
            }
            sumsBySubject.add(new Label(name, scoresSum));
        }
        sumsBySubject.sort(Comparator.naturalOrder());
        return sumsBySubject.get(sumsBySubject.size() - 1);
    }
}

