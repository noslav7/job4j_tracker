package ru.job4j.search;

import java.util.LinkedList;

public class PriorityQueue {

    private LinkedList<Task> tasks = new LinkedList<>();

    public int put(Task task) {
        var index = 0;
        for (Task element : tasks) {
            if (element.getNumber() > task.getNumber()) {
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
