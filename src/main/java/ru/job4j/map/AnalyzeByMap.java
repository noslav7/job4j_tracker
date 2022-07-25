package ru.job4j.map;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class AnalyzeByMap {
    public static double averageScore(List<Pupil> pupils) {
        List<Subject> allPupilsSubjects = new ArrayList<>();
        int scoresNumber = 0;
        for (int i = 0; i < pupils.size(); i++) {
            for (int subjectIndex = 0; subjectIndex < pupils.get(i).subjects().size(); subjectIndex++) {
                allPupilsSubjects.add(pupils.get(i).subjects().get(subjectIndex));
                scoresNumber++;
            }
        }
        double scoresSum = 0;
        for (Subject subject : allPupilsSubjects) {
            scoresSum += subject.score();
        }
        return scoresSum / scoresNumber;
    }

    public static List<Label> averageScoreBySubject(List<Pupil> pupils) {
        List<Subject> allPupilsSubjects = new ArrayList<>();
        for (int i = 0; i < pupils.size(); i++) {
            for (int subjectIndex = 0; subjectIndex < pupils.get(i).subjects().size(); subjectIndex++) {
                allPupilsSubjects.add(pupils.get(i).subjects().get(subjectIndex));
            }
        }
        List<Subject> distinctSubjects = new ArrayList<>();
        for (Subject subject : allPupilsSubjects) {
            if (!distinctSubjects.contains(subject)) {
                distinctSubjects.add(subject);
            }
        }
        List<Label> labels = new ArrayList<>();
        for (int i = 0; i < distinctSubjects.size(); i++) {
            String name = "";
            double quantityScores = 0D;
            double scoresSum = 0D;
            for (int j = 0; j < allPupilsSubjects.size(); j++) {
                if (distinctSubjects.get(i).equals(allPupilsSubjects.get(j).name())) {
                    name = allPupilsSubjects.get(j).name();
                    scoresSum += allPupilsSubjects.get(j).score();
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
        List<Subject> allPupilsSubjects = new ArrayList<>();
        for (int i = 0; i < pupils.size(); i++) {
            for (int subjectIndex = 0; subjectIndex < pupils.get(i).subjects().size(); subjectIndex++) {
                allPupilsSubjects.add(pupils.get(i).subjects().get(subjectIndex));
            }
        }
        List<Subject> distinctSubjects = new ArrayList<>();
        for (Subject subject : allPupilsSubjects) {
            if (!distinctSubjects.contains(subject)) {
                distinctSubjects.add(subject);
            }
        }
        List<Label> sumsBySubject = new ArrayList<>();
        for (int i = 0; i < distinctSubjects.size(); i++) {
            double scoresSum = 0D;
            for (int j = 0; j < allPupilsSubjects.size(); j++) {
                if (distinctSubjects.get(i).equals(allPupilsSubjects.get(j).name())) {
                    scoresSum += (double) allPupilsSubjects.get(j).score();
                }
            }
            sumsBySubject.add(new Label(distinctSubjects.get(i).name(), scoresSum));
        }
        sumsBySubject.sort(Comparator.naturalOrder());
        return sumsBySubject.get(sumsBySubject.size() - 1);
    }
}

