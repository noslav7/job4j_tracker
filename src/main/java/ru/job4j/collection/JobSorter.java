package ru.job4j.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class JobSorter {
    public static void main(String[] args) {
        List<Job> jobs = Arrays.asList(
                new Job("Fix bugs", 4),
                new Job("Impl task", 2),
                new Job("Reboot server", 1),
                new Job("X task", 0)
        );
        Collections.sort(jobs, new JobDescByName().thenComparing(new JobDescByPriority()));
        System.out.println(jobs);
        Comparator<Job> combDecs = new JobDescByNameLn()
                .thenComparing(new JobDescByName())
                .thenComparing(new JobDescByPriority());
        Collections.sort(jobs, combDecs);
        System.out.println(jobs);
        Collections.sort(jobs, new JobAscByName().thenComparing(new JobAscByPriority()));
        System.out.println(jobs);
        Comparator<Job> combAcs = new JobAscByNameLn()
                .thenComparing(new JobAscByName())
                .thenComparing(new JobAscByPriority());
        Collections.sort(jobs, combAcs);
        System.out.println(jobs);
    }
}
