package ru.job4j.list;

import java.util.List;

public class RepositionElement {
    public static List<String> changePosition(List<String> list, int index) {
        String element = list.remove(list.size() - 1);
        if (index <= list.size()-1) {
            list.set(index, element);
        }
        return list;
    }
}
