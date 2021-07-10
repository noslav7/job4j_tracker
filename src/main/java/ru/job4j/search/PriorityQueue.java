package ru.job4j.search;

import java.util.LinkedList;

public class PriorityQueue {
    private LinkedList<Task> tasks = new LinkedList<>();

    public int put(Task task) {
        int index = 0;
        int maximum = tasks.get(0).getPriority();
        this.tasks.add(index, task);
        for (int i = 1; i < tasks.size(); i++) {
            if (tasks.get(i).getPriority() > maximum) {
                maximum = tasks.get(i).getPriority();
                index = i;
            }
        }
        return index;
    }

    public Task take() {
        return tasks.poll();
    }
}
