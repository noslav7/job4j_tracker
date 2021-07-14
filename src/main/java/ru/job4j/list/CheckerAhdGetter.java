package ru.job4j.list;
import java.util.List;

public class CheckerAhdGetter {
    public static String getElement(List<String> list) {
        String string = "null";
        if (list.isEmpty()) {
            return "";
        } else {
            string = list.get(0);
            }
        return string;
        }
    }