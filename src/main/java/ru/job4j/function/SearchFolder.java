package ru.job4j.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class SearchFolder {

    public static List<Folder> filter(List<Folder> list, Predicate<Folder> pred) {
        List<Folder> folders = new ArrayList<>();
        for (Folder f : list) {
            if (pred.test(f))  {
                folders.add(f);
            }
        }
        return folders;
    }
}
