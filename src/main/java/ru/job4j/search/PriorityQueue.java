package ru.job4j.search;

import java.util.LinkedList;
/*
public class PriorityQueue {
    private LinkedList<Task> tasks = new LinkedList<>();

    public int put(Task task) {
        int index = 0;
        for (Task element : tasks) {
            if (element.getPriority() > task.getPriority()) {
                break;
            }
            index++;
        }
        this.tasks.add(index, task);
        return index;
    }

    public Task take() {
        return tasks.poll();
    }
}
*/