package ru.job4j.list;
import java.util.ArrayList;
import java.util.List;

public class AddElement {
    public static boolean addNewElement(List<String> list, String str) {
        boolean added = false;
        List<String> check = new ArrayList<>(list);
        list.add("Строка");
        if (list.size() != check.size()) {
            added = true;
        }
        return added;
    }
}
