package ru.job4j.hash;

import java.util.*;

public class Task5 {
    public static List<Integer> multiAssign(List<Task> tasks) {
        ArrayList<Integer> employeeIds = new ArrayList<>();
        for (int i = 0; i < tasks.size(); i++) {
            employeeIds.add(tasks.get(i).assignId);
        }
        List<Integer> uniqueEmployeeIds = employeeIds.stream()
                .distinct()
                .toList();
        List<Integer> assignTwoOrMoreIds = new ArrayList<>();
        for (int i = 0; i < uniqueEmployeeIds.size(); i++) {
            int tasksNumber = 0;
            for (int j = 0; j < tasks.size(); j++) {
                if (uniqueEmployeeIds.get(i).equals(tasks.get(j).assignId)) {
                    tasksNumber++;
                    if (tasksNumber > 1) {
                        assignTwoOrMoreIds.add(tasks.get(j).assignId);
                        break;
                    }
                }
            }
        }
        return assignTwoOrMoreIds;
    }

    public record Task(Integer taskId, Integer assignId) {
    }
}
