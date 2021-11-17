package ru.job4j.map;

import java.util.*;

public class Dictionary {
    public static Map<String, List<String>> collectData(String[] strings) {
        Map<String, List<String>> rsl = new HashMap<>();
        Set<String> keySet = new HashSet<>();

        for (String str : strings) {
            keySet.add(String.valueOf(str.charAt(0)));
        }

        for (String key : keySet) {
            List<String> secondList = new ArrayList<>();
            for (String str : strings) {
                if (key.equals(String.valueOf(str.charAt(0)))) {
                    secondList.add(str);
                }
            }
            rsl.put(key, secondList);
        }
        return rsl;
    }
}
