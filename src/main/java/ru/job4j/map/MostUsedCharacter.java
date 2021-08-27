package ru.job4j.map;

import java.util.*;

public class MostUsedCharacter {

    public static char getMaxCount(String str) {
        char rsl = ' ';
        String noSpacesString = str.replaceAll("\\s+", "");
        String noSpacesLowCaseString = noSpacesString.toLowerCase(Locale.ROOT);

        ArrayList<Character> list = new ArrayList<>();
        for (char num : noSpacesLowCaseString.toCharArray()) {
            list.add(num);
        }

        TreeMap<String, Integer> map = new TreeMap<>();

        for (Character ch : list) {
             map.putIfAbsent(String.valueOf(ch), 0);
             map.computeIfPresent(String.valueOf(ch), (k, v) -> v + 1);
        }

        int maxValueInMap = (Collections.max(map.values()));

        for (Map.Entry<String, Integer> entry: map.entrySet()) {
            if (entry.getValue() == maxValueInMap) {
                String last = entry.getKey();
                rsl = last.charAt(0);
                break;
            }
        }
        return rsl;
    }
}
