package ru.job4j.set;

import java.util.Set;

public class Firewall {
    public static String checkName(String s, Set<String> words) {
        String result = null;
        String[] arrayString = s.split(" ");
        for (int i = 0; i < arrayString.length; i++) {
            if (!words.contains(arrayString[i])) {
                result = "Вы сделали правильный выбор!";
            } else {
                result = "Выберите другую статью...";
            }
        }
        return result;
    }
}
